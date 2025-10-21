package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver loaded successfully");

            String connectionString = "jdbc:mysql://localhost:3307/srm_centralized_users";
            String username = "root";
            String password = "OnePlus6@1985";
            
            System.out.println("Trying connection: " + connectionString);
            con = DriverManager.getConnection(connectionString, username, password);
            System.out.println("✅ Connection successful to srm_centralized_users database!");
            
            stmt = con.createStatement();

            System.out.println("\n�� Available tables in srm_centralized_users:");
            rs = stmt.executeQuery("SHOW TABLES");
            while (rs.next()) {
                System.out.println("- " + rs.getString(1));
            }
            rs.close();
            
            System.out.println("\n�� Users table structure:");
            rs = stmt.executeQuery("DESCRIBE users");
            while (rs.next()) {
                String field = rs.getString("Field");
                String type = rs.getString("Type");
                String nullAllowed = rs.getString("Null");
                String key = rs.getString("Key");
                System.out.println(field + " | " + type + " | " + nullAllowed + " | " + key);
            }
            rs.close();
            
            String query = "SELECT id, username, email, first_name, last_name, role, department, designation, employee_id, student_id, phone, status, created_at FROM users ORDER BY created_at DESC";
            rs = stmt.executeQuery(query);

            System.out.println("\n👥 Users in srm_centralized_users database:");
            System.out.println("=" + "=".repeat(80));
            
            int count = 0;
            while (rs.next()) {
                count++;
                int id = rs.getInt("id");
                String username_db = rs.getString("username");
                String email = rs.getString("email");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String role = rs.getString("role");
                String department = rs.getString("department");
                String designation = rs.getString("designation");
                String employeeId = rs.getString("employee_id");
                String studentId = rs.getString("student_id");
                String phone = rs.getString("phone");
                String status = rs.getString("status");
                String createdAt = rs.getString("created_at");

                System.out.println("ID: " + id);
                System.out.println("Username: " + username_db);
                System.out.println("Email: " + email);
                System.out.println("Name: " + firstName + " " + lastName);
                System.out.println("Role: " + role);
                System.out.println("Department: " + (department != null ? department : "N/A"));
                System.out.println("Designation: " + (designation != null ? designation : "N/A"));
                System.out.println("Employee ID: " + (employeeId != null ? employeeId : "N/A"));
                System.out.println("Student ID: " + (studentId != null ? studentId : "N/A"));
                System.out.println("Phone: " + (phone != null ? phone : "N/A"));
                System.out.println("Status: " + status);
                System.out.println("Created: " + createdAt);
                System.out.println("-" + "-".repeat(60));
