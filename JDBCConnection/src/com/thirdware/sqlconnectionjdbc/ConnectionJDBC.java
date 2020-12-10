package com.thirdware.sqlconnectionjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionJDBC {
	
	Connection connection = null;
	String DBURL = "jdbc:sqlserver://LAPTOP-3LQ35BQE\\SQLEXPRESS:61660;databaseName=EmployeeDB";
	String USER = "sa";
	String PASSWORD = "database";
	
	Properties properties = new Properties();
	///JDBCConnection/src/DBCredentials.properties
	public void readOperation() {
		
		properties.getProperty(DBURL);

		try {
			connection = DriverManager.getConnection(DBURL, USER, PASSWORD);
			System.out.println("Connection Established");
			Statement statement = connection.createStatement();
			String query = "select * from department";
			ResultSet resultSet = statement.executeQuery(query);
			System.out.println("DepartmentID:\tDepartmentName");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + ":\t" + resultSet.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeOperation() {
		try {
			connection = DriverManager.getConnection(DBURL, USER, PASSWORD);
			System.out.println("Inserting Data");
			String query = "Insert into department values (?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 6);
			preparedStatement.setString(2, "Security");
			int count = preparedStatement.executeUpdate();
			System.out.println(count+" row affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateOperation() {
		try {
			connection = DriverManager.getConnection(DBURL, USER, PASSWORD);
			System.out.println("Inserting Data");
			int deptID = 6;
			String query = "Update department "
					+ "set departmentName=(?) where departmentID="+deptID;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, "CyberSecurity");
			int count = preparedStatement.executeUpdate();
			System.out.println(count+" row affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteOperation() {
		try {
			connection = DriverManager.getConnection(DBURL, USER, PASSWORD);
			System.out.println("Inserting Data");
			int deptID = 2;
			String query = "delete from department where departmentID="+deptID;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			int count = preparedStatement.executeUpdate();
			System.out.println(count+" row affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
