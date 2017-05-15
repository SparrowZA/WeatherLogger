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
import java.sql.*;
import java.util.Arrays;

/**
 *
 * @author Marc
 */
public class JDBCRead {
    // database URL
   static final String DATABASE_URL = "jdbc:oracle:thin:@localhost:1521/XE";
   String searchDate, dateCount;
   String [][] searchData;
   int i;

   // launch the application
   public void jdbcRead (String date) {
      searchDate = date; // assign variables to values passed from serial
      i=0;
      
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
         
         //Select data
         String sqlStatementData = "SELECT * FROM WEATHER_LOG "
                                 + "WHERE DATE_TIME LIKE '" 
                                 + searchDate + "%'";
         ResultSet rs = statement.executeQuery(sqlStatementData);
         searchData = new String[getRowCount(searchDate)][4];         
         
         while(rs.next()) {
             String dateTime = rs.getString("DATE_TIME");
             String [] parts = dateTime.split("\\s"); 
             
             searchData[i][0] = parts[0];
             searchData[i][1] = parts[1];
             searchData[i][2] = rs.getString("WIND_SPEED");
             searchData[i][3] = rs.getString("TEMPERATURE");
             i++;
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
   } //End JDBCRead method
   
   public String[][] getSearchData() {
       return searchData;
   }
   
   public int getRowCount(String searchDate) {
      Connection connection = null; // manages connection
      Statement statement = null; // query statement
      int rowCount = 0; 
      dateCount = searchDate;

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
         String sqlStatementLineNumber = "SELECT COUNT (*) FROM WEATHER_LOG "
                                       + "WHERE DATE_TIME LIKE '"
                                       + dateCount + "%'";
         
         //Do a row count to determine the size of the searchData array
         ResultSet rs = statement.executeQuery(sqlStatementLineNumber);
         /*
            Row counter written by:
            http://www.java2s.com/Tutorial/Java/0340__Database/GettheNumberofRowsinaDatabaseTable.htm
         */         
         // get the number of rows from the result set
         rs.next();
         rowCount = rs.getInt(1);         
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
      }
      return rowCount;
   }
   
} //End JDBCRead class

    
