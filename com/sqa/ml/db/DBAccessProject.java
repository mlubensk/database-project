/**
 *   File Name: DBAccessProject.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Aug 12, 2015
 *   
 */

package com.sqasolution.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DBAccessProject //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class DBAccessProject {

	String myDriver;
	String myUrl;
	String username;
	String password;

	/**
	 * @param myDriver
	 * @param myUrl
	 * @param username
	 * @param password
	 */

	/**
	 * @param string
	 * @param string2
	 * @param string3
	 * @param string4
	 */
	public DBAccessProject(String myDriver, String myUrl, String username, String password) {
		this.myDriver = myDriver;
		this.myUrl = myUrl;
		this.username = username;
		this.password = password;
	}

	/**
	 * @param myResults
	 */
	static void displayResults(ResultSet myResults, String... columns) {
		try {
			while (myResults.next()) {
				for (int i = 0; i < columns.length; i++) {
					System.out.print(columns[i] + ":" + myResults.getString(columns[i]) + " ");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ResultSet getRecords(String selectString) {
		ResultSet resultSet = null;
		try {
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, username, password);
			String query = selectString;
			Statement st = conn.createStatement();
			resultSet = st.executeQuery(query);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}

	public boolean updateRecords(String selectString) {
		// TODO Create implementation for Driver Management, Connecting and
		// updating records.
		return false;
	}

	public boolean insertRecords(String selectString) {
		// Put code in Try Catch to catch exceptions
		try {
			// Get driver
			Class.forName(myDriver);
			// Create connection object from the DriverManger's createConnection
			// method given the 3 fields of the instance of DBAccessProject
			Connection conn = DriverManager.getConnection(myUrl, username, password);
			// Create Statement object from the createStatment
			Statement statement = conn.createStatement();
			// Perform the executeUpdate method of the Statement instance to
			// prepare for execution
			statement.executeUpdate(selectString);
			// If AutoCommit is set to true, the conn.commit is not needed. If
			// you wanted to take advantage of auto commit, you would need to
			// set the autoCommit to false
			conn.setAutoCommit(false);
			// This line is not needed if autoCommit is set to true
			conn.commit();
		} catch (ClassNotFoundException e) {
			// Print stack
			e.printStackTrace();
			// Return false to signify that execution did not work
			return false;
		} catch (SQLException e) {
			// Print stack
			e.printStackTrace();
			// Return false to signify that execution did not work
			return false;
		}
		return true;
	}

	public boolean deleteRecords(String selectString) {
		// TODO Create implementation for Driver Management, Connecting and
		// deleting records.
		return false;
	}

}
