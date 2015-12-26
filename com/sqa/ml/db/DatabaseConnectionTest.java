/**
 *   File Name: DatabaseConnectionTest.java<br>
 *
 *   Lubensky, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Dec 22, 2015
 *   
 */

package com.sqa.ml.db;

//import junit.framework.TestCase;
//
//import static org.junit.Assert*;
//
//import org.junit.Test;


/**
 * DatabaseConnectionTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Lubensky, Michael
 * @version     1.0.0
 * @since       1.0
 *
 */
public class DatabaseConnectionTest extends TestCase {
	@Test
	public void test() {
		DBAccessProject dbp = new DBAccessProject("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:8889/sqa", "root", "root")
	}
}
