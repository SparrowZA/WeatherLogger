/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherlogger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Marc
 */
public class JDBCTableCreate {
    // database URL
   static final String DATABASE_URL = "jdbc:oracle:thin:@localhost:1521/XE";
   String windSpeed, temp;
   boolean tablePresent;

   // launch the application
   public boolean jdbcTablePresent () {       
      Connection connection = null; // manages connection
      Statement statement = null; // query statement
      ResultSet resultSet; // manages results

      // connect to database books and query database
      try
      {
         //load the oracle JBDC Driver
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

         // establish connection to database
         connection = DriverManager.getConnection( DATABASE_URL, "SYSTEM", "oracle" );

         // create Statement for querying database
         statement = connection.createStatement();

         // query database
         resultSet = statement.executeQuery( "SELECT * FROM WEATHER_LOG" );
         
         if(resultSet == null) {
            tablePresent = false;
         }
            else
         {
            tablePresent = true;
         }
      }  // end try
      catch ( SQLException sqlException )
      {          
         sqlException.printStackTrace();
         
      } // end catch
      finally // ensure resultSet, statement and connection are closed
      {
         try
         {
          //  resultSet.close();
            statement.close();
            connection.close();
         } // end try
         catch ( Exception exception )
         {
            exception.printStackTrace();
         } // end catch
      } // end finally
      
      return tablePresent;
   } // end main
      
   public void createTable() {
    Connection connection = null; // manages connection
      Statement statement = null; // query statement

      // connect to database books and query database
      try
      {
         //load the oracle JBDC Driver
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

         // establish connection to database
         connection = DriverManager.getConnection( DATABASE_URL, "SYSTEM", "oracle" );

         // create Statement for querying database
         statement = connection.createStatement();

         // query database
         statement.executeUpdate( "CREATE TABLE WEATHER_LOG (DATE_TIME varchar2(21), WIND_SPEED varchar2(7), TEMPERATURE varchar2(7));" );
      }  // end try
      catch ( SQLException sqlException )
      {          
         sqlException.printStackTrace();
         
      } // end catch
      finally // ensure resultSet, statement and connection are closed
      {
         try
         {
            statement.close();
            connection.close();
         } // end try
         catch ( Exception exception )
         {
            exception.printStackTrace();
         } // end catch
      } // end finally
   }
}
