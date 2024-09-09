package jdbcConnectionProgrammes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class CheckConnectionEx2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException  {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver
        String url = "jdbc:mysql://localhost:3306/school";
        Connection con = DriverManager.getConnection(url, "root", "root"); // Establish connection
        
        System.out.println("Database dbemp connection successfully established");
        
        // Creating Statement object with scrollable and updatable ResultSet
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        // Execute a query to get the ResultSet
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        
        // Perform some operations to demonstrate scrollable ResultSet
        System.out.println("Navigating through ResultSet:");
        if (rs.last()) {
            System.out.println("Last row - rollno: " + rs.getInt(1) + ", stu_name: " + rs.getString(2));
        }
        
        if (rs.first()) {
            System.out.println("First row - rollno: " + rs.getInt(1) + ", stu_name: " + rs.getString(2));
        }
        
        if (rs.absolute(2)) {
            System.out.println("Second row - rollno: " + rs.getInt(1) + ", stu_name: " + rs.getString(2));
        }
        
        // Update a row in the ResultSet
        rs.absolute(2); // Move cursor to the second row
        rs.updateString("stu_name", "UpdatedName");
        rs.updateRow(); // Apply the update
        
        // Display the updated ResultSet
        rs.beforeFirst(); // Move cursor before the first row
        System.out.println("Updated Student records:");
//        while (rs.next()) {
//            System.out.println("rollno: " + rs.getInt(1));
//            System.out.println("stu_name: " + rs.getString(2));
//            System.out.println("class: " + rs.getString(3));
//            System.out.println("stu_dob: " + rs.getDate(4));
//        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("rollno \t name  \t class  \t dob");
       while (rs.next()) {
    	    int roll = rs.getInt("rollno");
    	    String name = rs.getString("name");
    	    String className = rs.getString("class");  // Avoid using reserved keywords like 'class'
    	    Date dob = rs.getDate("dob");

    	    System.out.println(roll + "\t" + name + "\t" + className + "\t" + dob);
    	}

        rs.close();
        stmt.close();
        con.close();
    }
}

