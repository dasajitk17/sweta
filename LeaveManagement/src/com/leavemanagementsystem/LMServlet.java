package com.leavemanagementsystem;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class LMServlet
 */
@WebServlet("/LMServlet")
public class LMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LMServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // JDBC driver name and database URL
		System.out.print("ID:1");
		Statement stmt = null;
		try{
			System.out.print("ID:2");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.print("ID:3");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","mysql"
				);
		System.out.print("ID:4");
		stmt = con.createStatement();
		
	      String sql = "INSERT INTO salary (id,name,salaryamount) VALUES(4,'D',25000)";

	      stmt.executeUpdate(sql);
	      System.out.println("*******");
	      sql = "INSERT INTO salary VALUES (5,'E',30000)";
	      stmt.executeUpdate(sql);
	      sql = "INSERT INTO salary" +
	                   "VALUES(6,'F',35000)";
	      stmt.executeUpdate(sql);
	      System.out.println("Inserted records into the table...");
		
	}catch(Exception e){
		System.out.print(e);
	}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
