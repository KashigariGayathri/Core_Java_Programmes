package jdbcConnectionProgrammes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver
        String url = "jdbc:mysql://localhost:3306/dbmysql1";
        Connection conn = DriverManager.getConnection(url, "root", "root"); // Establish connection
//        PreparedStatement ps = conn.prepareStatement("insert into employees values(?,?,?,?)");
//        ps.setInt(1, 71);
//        ps.setString(2, "k");
//        ps.setString(3, "Sri");
//        ps.setString(4, "Sri@gmail.com");
//        ps.executeUpdate();
//        ps.setInt(1, 72);
//        ps.setString(2, " k");
//        ps.setString(3, "mSri");
//        ps.setString(4, "MSri@gmail.com");
//        ps.executeUpdate();
//        ps.setInt(1, 73);
//        ps.setString(2, " Gayathri");
//        ps.setString(3, "Kashigari");
//        ps.setString(4, "Gayathri@gmail.com");
//        ps.executeUpdate();
//        ps.setInt(1, 74);
//        ps.setString(2, " Divya");
//        ps.setString(3, "karnati");
//        ps.setString(4, "Divya@gmail.com");
//        ps.executeUpdate();
//        ps.setInt(1, 75);
//        ps.setString(2, " Shivani");
//        ps.setString(3, "bembadi");
//        ps.setString(4, " Shivani@gmail.com");
//        ps.executeUpdate();
//        System.out.println("Recored inserted");
//        
//        PreparedStatement ps1 = conn.prepareStatement("delete from employees where empid=71");
//       
//        ps1.executeUpdate();
//        System.out.println("Recored deleted");

		// Create a PreparedStatement for deleting data from the student table
		String deleteQuery = "DELETE FROM employees WHERE empid = ?";
		PreparedStatement ps = conn.prepareStatement(deleteQuery);

		// Set the value for the PreparedStatement
		ps.setInt(1, 72); // Specify the roll number of the student to delete

		// Execute the delete statement
		int rowsAffected = ps.executeUpdate();

		// Print a success message indicating the number of rows deleted
		if (rowsAffected > 0) {
			System.out.println("Record Deleted Successfully. Number of rows affected: " + rowsAffected);
		} else {
			System.out.println("No record found with the specified roll number.");
		}

		// Close the PreparedStatement and Connection to free resources
		ps.close();
		conn.close();
       
	}

}
