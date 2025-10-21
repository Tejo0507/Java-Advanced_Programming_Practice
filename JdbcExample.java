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
