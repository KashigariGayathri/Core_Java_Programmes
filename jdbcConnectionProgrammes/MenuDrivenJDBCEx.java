package jdbcConnectionProgrammes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuDrivenJDBCEx{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		try {
			// Load and register the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the connection to the database
			String url = "jdbc:mysql://localhost:3306/coursemysql";
			Connection con = DriverManager.getConnection(url, "root", "root");
			System.out.println("Database connection successfully established");

			// Create a Statement object
			Statement stmt = con.createStatement();

			do {
				System.out.println("Menu:");
				System.out.println("1. View Records");
				System.out.println("2. Update Record");
				System.out.println("3. Insert Record");
				System.out.println("4. Delete Record");
				System.out.println("5. Exit");
				System.out.print("Enter your choice: ");
				choice = scanner.nextInt();

				switch (choice) {
				case 1:
					viewRecords(stmt);
					break;
				case 2:
					updateRecord(stmt, scanner);
					break;
				case 3:
					insertRecord(stmt, scanner);
					break;
				case 4:
					deleteRecord(stmt, scanner);
					break;
				case 5:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			} while (choice != 5);

			// Close the Statement and Connection
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL exception occurred");
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	public static void viewRecords(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("SELECT * FROM Learner");
		System.out.println("Learner Records:");
		while (rs.next()) {
			System.out.println("Learner_ID: " + rs.getInt(1));
			System.out.println("LName: " + rs.getString(2));
			System.out.println("Lage: " + rs.getInt(3));
			System.out.println("LDegree: " + rs.getString(4));
			System.out.println("City: " + rs.getString(5));
			System.out.println("----------------------------");
		}
		rs.close();
	}

	public static void updateRecord(Statement stmt, Scanner scanner) throws SQLException {
		System.out.print("Enter ID of the Learner to update: ");
		int rollNo = scanner.nextInt();
		scanner.nextLine(); // consume newline
		System.out.print("Enter new degree: ");
		String newClass = scanner.nextLine();
		String updateQuery = "UPDATE Learner SET degree='" + newClass + "' WHERE learnerid=" + rollNo;
		stmt.executeUpdate(updateQuery);
		System.out.println("Record updated successfully");
	}

	public static void insertRecord(Statement stmt, Scanner scanner) throws SQLException {
		System.out.print("Enter ID: ");
		int learnerid = scanner.nextInt();
		scanner.nextLine(); // consume newline
		System.out.print("Enter Name: ");
		String lname = scanner.nextLine();
		System.out.print("Enter Age: ");
		int lage = scanner.nextInt();
		System.out.print("Enter Degree: ");
		String degree = scanner.nextLine();
		scanner.nextLine(); // consume newline1
		System.out.print("Enter City: ");
		String city = scanner.nextLine();
		String insertQuery = "INSERT INTO Learner VALUES( "+ learnerid + ", '" + lname + "', '" + lage + "', '" + degree
				+ "', '" + city + "')";
		stmt.executeUpdate(insertQuery);
		System.out.println("Record inserted successfully");
	}

	public static void deleteRecord(Statement stmt, Scanner scanner) throws SQLException {
		System.out.print("Enter ID of the Learner to delete: ");
		int rollNo = scanner.nextInt();
		String deleteQuery = "DELETE FROM Learner WHERE learnerid=" + rollNo;
		stmt.executeUpdate(deleteQuery);
		System.out.println("Record deleted successfully");
	}
}

