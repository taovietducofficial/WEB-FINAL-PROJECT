package test;

import java.sql.Connection;
import database.JDBCUtil;

public class TestJDBCUtil {
    public static void main(String[] args) {
        try {
            Connection connection = JDBCUtil.getConnection();
            if (connection != null) {
                System.out.println("Database connection successful!");
                System.out.println(connection.toString());
            } else {
                System.out.println("Database connection failed!");
            }
        } catch (Exception e) {
            System.out.println("Connection error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close connection if needed
        }
    }
}
