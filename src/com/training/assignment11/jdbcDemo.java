package com.training.assignment11;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;

public class jdbcDemo {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
			String userName = "system";
			String password = "system";
			
			Connection con = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is successful");
		
			//Statement stmt = con.createStatement();
			
//			String query = "CREATE TABLE STUDENTS("
//					+ "STUD_ID VARCHAR(6) PRIMARY KEY,"
//					+ "STUD_NAME VARCHAR(20) NOT NULL,"
//					+ "ADDRESS VARCHAR(3) NOT NULL,"
//					+ "BRANCH VARCHAR(10) NOT NULL)";
			
//			String query = "INSERT INTO STUDENT VALUES('ST101', 'JOHN', 'MNL', 'CS')";
//			
//			stmt.execute(query);
//			
//			PreparedStatement stmt = con.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?)");
//			
//			stmt.setString(1, "ST02");
//			stmt.setString(2, "Peter");
//			stmt.setString(3, "MKT");
//			stmt.setString(4, "IT");

//			String query = "{call ADD_STUDENT(?,?,?,?)}";
//			
//			CallableStatement cs = con.prepareCall(query);
//			
//			cs.setString(1, "ST104");
//			cs.setString(2, "Ron");
//			cs.setString(3, "MNL");
//			cs.setString(4, "CS");
//			
//			cs.execute();
			
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM STUDENT");

			ArrayList<Student> students = new ArrayList<>();
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				students.add(new Student(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4)));
			}
			
			students.stream()
					.sorted(Comparator.comparing(Student::getStudName))
					.forEach(s -> System.out.println(s.getStudName()));
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
