

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hiddenservlet
 */
@WebServlet("/hiddenservlet")
public class hiddenservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hiddenservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
    try {
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
       String n=request.getParameter("name");
       out.print("Welcome"+n);
       out.print("<html><body>");
       out.print("<form action='secondservlet'>");
       out.print("<input type='hidden' name='name' value='"+n+"'>");   
        out.print("<input type='submit' value='go'>");
     out.print("</form>");
     out.println("</body></html>");
     out.close();
    }
	
	
	catch(Exception e)
    {
		System.out.println(e);
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
