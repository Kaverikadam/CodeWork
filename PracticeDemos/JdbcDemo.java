package com.PracticeDemos;

import java.beans.Statement;
import java.beans.Statement.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root123");
			java.sql.Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			
		}

	}

}
