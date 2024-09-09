package jdbcConnectionProgrammes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckConnection {
public static void main(String[] args) throws SQLException, ClassNotFoundException  {
	        Class.forName("com.mysql.cj.jdbc.Driver"); // registering driver
	        Statement stmt;
	        String url = "jdbc:mysql://localhost:3306/school";
	        Connection con = DriverManager.getConnection(url, "root", "root");// establish connection
	        //System.out.println(con);
	        System.out.println("Database dbemp connection suceesfully establish");
            stmt=con.createStatement();//creating object for Statement
            //String s="insert into student values(12,'Shivani','IT','2002-12-13')";
            //String s="update student set class='bio' where rollno=12";
            String s="delete from student where rollno=12";
            stmt.executeUpdate(s);
            ResultSet rs = stmt.executeQuery("select * from student");
            System.out.println("Get Student records:");
            while (rs.next()) {
                    System.out.println("rollno:"+rs.getInt(1));
                    System.out.println("stu_name:"+rs.getString(2));
                    System.out.println("class:"+rs.getString(3));
                    System.out.println("stu_dob:"+rs.getDate(4));
            }
            rs.close();
	}

}
