

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registrationservlet
 */
@WebServlet("/registrationservlet")
public class registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		try
		{
			String Name=request.getParameter("name");
		String Dep=request.getParameter("dep");
		String Desg=request.getParameter("desg");
		String Company=request.getParameter("company");
		String mobileno=request.getParameter("mobilebno");
		String emailid=request.getParameter("emailid");
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
		PreparedStatement ps=con.prepareStatement("insert into employeee values(?,?,?,?,?,?)");
		ps.setString(1,Name);
		ps.setString(2,Dep);
		ps.setString(3,Desg);
		ps.setString(4,Company);
		ps.setString(5,mobileno);
		ps.setString(6,emailid);
	   int count=ps.executeUpdate();
	   response.setContentType("text/html");
	   PrintWriter out=response.getWriter();
	   out.println("<html><body>");
	   if(count==1)
		     out.println("<b>registration completed sucessfully...............................</b>");
	   else
		   out.println("</b>registration is not completed sucessfully.............</b>");
	out.println("</body></html>");
	ps.close();
	con.close();
	out.close();
	}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
}	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
