

import java.io.*;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	Connection con;
	public void init(ServletConfig config) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENTDATABASE","tiger");
			System.out.println("connection successfull");
//			PreparedStatement st=con.prepareStatement("select * from login where username")
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
			String username=request.getParameter("username");
			String pass=request.getParameter("password");
		try {
			 String query="select * from login where username=? and pass=?";
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, username);
			st.setString(2, pass);
			
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
				request.setAttribute("loginMessage", "success");
			}else {
				request.setAttribute("loginMessage", "failure");
			}
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
//			if(rs.next()) {
//				if(rs.getString("username").equals(username) &&rs.getString("pass").equals(pass)) {
//					out.println("You are successfully Login<br>");
//					
//				}
//				else {
//					out.println("Please enter correct details<br>");
//				}
//			}
//			else {
//				out.println("Please enter correct details<br>");
//			}
//out.println("Click to<a href=\"/LoginProject/Login.jsp\">Logout</a> ");
			
		} catch (SQLException e) {
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
	public void destroy() {
		try {
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
