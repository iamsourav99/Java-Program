

import java.io.*;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;



@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	Connection con;
	public void init() {
		try {
			//database connection 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENTDATABASE","tiger");
			System.out.println("Connection successfull");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String pass=request.getParameter("password");
		 if (con == null) {
	            out.println("Unable to connect to the database. Please try again later.");
	            return;
	        }
		 String sql="insert into Login values (?,?,?)";
		try {
			PreparedStatement st=con.prepareStatement((sql));
			st.setString(1, name);
			st.setString(2, username);
			st.setString(3, pass);
			int result=st.executeUpdate();
			if(result>0) {
				request.setAttribute("messege", "success");
			}else {
				request.setAttribute("messege", "failure");
			}
			RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
			out.println("You are successfully Registered<br>");
			out.println("Click <a href=\"/LoginProject/Login.jsp\">here</a> to Login");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("Error occured");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public void destroy() {
		if(con!=null) {
			
			try {
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
