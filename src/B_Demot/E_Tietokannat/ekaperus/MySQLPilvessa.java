import java.sql.*;

public class MySQLPilvessa {

	public static void main(String args[]) {
		try {

			String URL = "jdbc:mysql://remotemysql.com:3306";
			String dbname = "8RDc7QjrLQ";
			String USER = "8RDc7QjrLQ";
			String PASS = "hTZGC7vzUQ";

			// Connection con =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/kirjasto", "root",
			// "");
			Connection con = DriverManager.getConnection(URL + "/" + dbname, USER, PASS);
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM kirjat");

			while (rs.next())
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
