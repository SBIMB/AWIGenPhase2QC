/**
 * 
 */
package za.ac.wits.sbimb.awigen.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import za.ac.wits.sbimb.awigen.dao.LoginDAO;

/**
 * @author Freedom Mukomana
 *
 */
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8596407508082550887L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  

        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        
        String n=request.getParameter("username");  
        String p=request.getParameter("userpass"); 
        
        HttpSession session = request.getSession(false);
        if(session!=null)
        session.setAttribute("name", n);

        if(new LoginDAO().validate(n, p)){  
            RequestDispatcher rd=request.getRequestDispatcher("home.jsp");  
            rd.forward(request,response);  
        }  
        else{  
            out.print("<p style=\"color:red\">Sorry username or password error</p>");  
            RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");  
            rd.include(request,response);  
        }  

        out.close();  
    }  
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            RequestDispatcher requestDispatcher = getServletConfig().getServletContext().
                    getRequestDispatcher("/Success.jsp");
            requestDispatcher.forward(request, response);
        } finally {
            out.close();
        }
    }
}
