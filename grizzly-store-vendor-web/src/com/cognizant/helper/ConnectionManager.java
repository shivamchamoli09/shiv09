package com.cognizant.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private Connection connection;
	public Connection openConnection(){
		try{
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch(ClassNotFoundException e){
			
		}
		try{
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","SYSTEM","cognizant");
		}
		catch(SQLException e){
			
		}
		return connection;
	}
	public void closeConnection(){
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}