package jdbcConnectionProgrammes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.CallableStatement;

public class StoredProcedureEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver"); // registering driver
        
        String url = "jdbc:mysql://localhost:3306/coursemysql";
        Connection con = DriverManager.getConnection(url, "root", "root");// establish connection
        System.out.println(con);
        System.out.println("Database dbemp connection suceesfully establish");
   
        CallableStatement statement = con.prepareCall("{call  emp_sal_procedure()}");
        statement.execute();
        ResultSet rs11=statement.executeQuery();  

	}

}
