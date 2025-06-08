/* 
•	Create a new database “Student”
•	Create a table “stud_rec” 
		Col1: rol no. (int) 
		Col2: name (varchar 20) 
•	WAP in java to insert a record into “stud_rec”
 
will add description and instructions later
*/


import java.sql.*;

public class InsertStudentRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Student"; // Your database URL
        String username = "root"; // Default XAMPP username
        String password = ""; // Default XAMPP password (empty)

        int rollNo = 123;
        String name = "Amrit Raj Garg";

        try {
            // Load JDBC driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare SQL insert query
            String query = "INSERT INTO stud_rec (roll_no, name) VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, rollNo);
            pst.setString(2, name);

            // Execute update
            int rows = pst.executeUpdate();
            System.out.println(rows + " record inserted.");

            // Close connection
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
