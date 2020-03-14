

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
 * Servlet implementation class serv2
 */
@WebServlet("/serv2")
public class serv2 extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv2() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
//response.getWriter().append("Served at: ").append(request.getContextPath());
String name=request.getParameter("name");
String desg=request.getParameter("desg");
String dept=request.getParameter("dept");
String mobile=(String)request.getAttribute("mobile");
String email=(String)request.getAttribute("email");
try {
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
PreparedStatement pst=con.prepareStatement("insert into employees1 values(?,?,?,?,?)");
pst.setString(1,name);
pst.setString(2,dept);
pst.setString(3,desg);
   pst.setString(4,mobile);
pst.setString(5,email);
int count=pst.executeUpdate();
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("<html><body>");
if(count==1)
{
out.println("<b>Registraion sucess<b>");
}
else
{
out.println("<b>not Registraion sucess<b>");
}
out.println("</body></html>");
out.close();
con.close();
} catch (ClassNotFoundException | SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}