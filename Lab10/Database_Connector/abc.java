/* 
Connect to MySql Server 

will update the description and add instructions later
*/

import java.sql.*;

public class abc {
    public static void main(String[] args) {
        Connection con = null;
        try {
            // Load MySQL JDBC driver (no need for newInstance())
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB (change 'test' if your DB name is different)
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            if (!con.isClosed()) {
                System.out.println("Successfully connected to MySQL server...");
            }
        } catch (Exception e) {
            System.err.println("Exception: " + e);
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println("Close Error: " + e);
            }
        }
    }
}
