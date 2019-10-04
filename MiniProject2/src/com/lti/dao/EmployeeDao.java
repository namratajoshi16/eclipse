package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import com.lti.model.Employee;

public class EmployeeDao {
	
	
	 public void add(Employee e){
		 Connection conn=null;
		 PreparedStatement stmt=null;
		 ResultSet rs=null;
		 
		 try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sys as sysdba", "Newuser123");
				String sql="INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";
				stmt=conn.prepareStatement(sql);
		
			
		
					stmt.setInt(1,e.getEid());
					stmt.setString(2,e.getFname());
					stmt.setString(3,e.getLname());
					stmt.setString(4,e.getDoj());
					stmt.setString(5,e.getDept());
					stmt.executeUpdate();
							
					System.out.println("Record added succesfully");
				
		 }
		 
			catch(ClassNotFoundException e1){
				System.out.println("JDBC driver not found");
			}
		 catch(SQLException e2){
			 e2.printStackTrace();
		 }
			finally{
			
				try{stmt.close();}catch(Exception e1){}
				try{conn.close();}catch(Exception e1){}
			}
	

}
}
