package com.sql.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction 
{
	public static void main(String[] args)
	{
		try
		{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			Statement statement = connection.createStatement();
			connection.setAutoCommit(false);
			connection.commit();
			statement.execute("delete from emptable where name = 'Vinith';");
			connection.rollback();
			
		}
		catch (SQLException e)
		{

			e.printStackTrace();
		}
	}

}
