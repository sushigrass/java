package jdbcdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		try {
			//Connect
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/petergillis","root","051893");
			
			//Statement
			Statement myStatement = myConn.createStatement();
			
			/*Create table
			String createTable = "CREATE TABLE REGISTRATION " +
	                   "(id INTEGER not NULL, " +
	                   " first VARCHAR(255), " + 
	                   " last VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 
			myStatement.executeUpdate(createTable);
			*/
			
			/*insert
			String insert = "insert into Employees values (3,100,'pete','gillis')";
			myStatement.executeUpdate(insert);
			*/
			
			/*update
			String update = "update Employees set first='dave' where id>=0";
			myStatement.executeUpdate(update);
			*/
			
			/*delete
			String delete = "delete from Employees where last='gillis'";
			myStatement.executeUpdate(delete);
			int rowsAffected = myStatement.executeUpdate(delete);
			System.out.println(rowsAffected);
			*/
			
			/*Results
			ResultSet myResult = myStatement.executeQuery("select * from Employees");
			
			//Process Result
			while (myResult.next()) {
				System.out.println(myResult.getInt("id")+", "+myResult.getString("first"));
			}
			 */
			
			/*PreparedStatement
			PreparedStatement ps = null;
			for (int i = 0; i < 100; i++){ {
				ps = myConn.prepareStatement("insert into REGISTRATION values (?,'lol','gillis',?)");
				ps.setInt(1,i);
				ps.setInt(2,i*10);
				ps.executeUpdate();
			}
			}
			ResultSet rs = ps.executeQuery("select * from REGISTRATION");
			*/
			
			//Convert to CSV
			//convertToCsv(rs);
			
			//InnerJoin
			String innerJoin = "SELECT * FROM Employees INNER JOIN REGISTRATION ON Employees.id = REGISTRATION.id";
			ResultSet innerResult = myStatement.executeQuery(innerJoin);
			convertToCsv(innerResult);
			
		} catch (Exception e){
			e.printStackTrace();
			
		}

	}
	
	public static void convertToCsv(ResultSet rs) throws SQLException, FileNotFoundException {
        PrintWriter csvWriter = new PrintWriter(new File("whatever_reg.csv")) ;
        ResultSetMetaData meta = rs.getMetaData() ; 
        int numberOfColumns = meta.getColumnCount() ; 
        String dataHeaders = "\"" + meta.getColumnName(1) + "\"" ; 
        for (int i = 2 ; i < numberOfColumns + 1 ; i ++ ) { 
                dataHeaders += ",\"" + meta.getColumnName(i).replaceAll("\"","\\\"") + "\"" ;
        }
        csvWriter.println(dataHeaders) ;
        while (rs.next()) {
            String row = "\"" + rs.getString(1).replaceAll("\"","\\\"") + "\""  ; 
            for (int i = 2 ; i < numberOfColumns + 1 ; i ++ ) {
                row += ",\"" + rs.getString(i).replaceAll("\"","\\\"") + "\"" ;
            }
        csvWriter.println(row) ;
        }
        csvWriter.close();
    }

}
