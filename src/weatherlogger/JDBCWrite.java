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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Marc Laurent Geffroy
 */
public class JDBCWrite {
   // database URL
   static final String DATABASE_URL = "jdbc:oracle:thin:@localhost:1521/XE";
   String windSpeed, temp;

   // launch the application
   void jdbcWrite ( String wind, String temperature )
   {
      windSpeed = wind; // assign variables to values passed from serial
      temp = temperature;
       
      Connection connection = null; // manages connection
      Statement statement = null; // query statement
      //int resultSet; // manages results
      
      DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Calendar date;
      date = Calendar.getInstance();

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
         String sqlStatement = "INSERT INTO WEATHER_LOG VALUES ( "
                 + "'" + df.format(date.getTime()) + "'"
                 + ", '" + windSpeed + "'"
                 + ", '" + temp + "' )";
         int rs = statement.executeUpdate(sqlStatement);
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
   } // end main
}
