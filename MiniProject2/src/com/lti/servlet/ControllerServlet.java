package com.lti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.EmployeeDao;
import com.lti.exception.DataAccessException;
import com.lti.model.Employee;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid=Integer.parseInt(request.getParameter("eid"));
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String doj=request.getParameter("doj");
		String dept=request.getParameter("dept");
		
		Employee employee=new Employee();
		
		employee.setEid(eid);
		employee.setFname(fname);
		employee.setLname(lname);
		employee.setDoj(doj);
		employee.setDept(dept);
		
		EmployeeDao dao=new EmployeeDao();
		try{
			    dao.add(employee);         
		}
		catch(Exception e){
			e.printStackTrace();
			
			
		}
		
		
	}

}
