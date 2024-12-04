package dao;

import model.Employee;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    
    // Lấy tất cả nhân viên
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM EMPLOYEE";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                employees.add(new Employee(
                    resultSet.getInt("MaNV"),
                    resultSet.getString("HoTen"),
                    resultSet.getString("ChucVu"), 
                    resultSet.getString("SDT"),
                    resultSet.getString("Email")
                ));
            }
        }
        return employees;
    }

    // Thêm nhân viên mới
    public boolean addEmployee(Employee employee) throws SQLException {
        String query = "INSERT INTO EMPLOYEE (HoTen, ChucVu, SDT, Email) VALUES (?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, employee.getHoTen());
            preparedStatement.setString(2, employee.getChucVu());
            preparedStatement.setString(3, employee.getSdt());
            preparedStatement.setString(4, employee.getEmail());
            
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        }
    }

    // Cập nhật thông tin nhân viên
    public boolean updateEmployee(Employee employee) throws SQLException {
        String query = "UPDATE EMPLOYEE SET HoTen = ?, ChucVu = ?, SDT = ?, Email = ? WHERE MaNV = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, employee.getHoTen());
            preparedStatement.setString(2, employee.getChucVu());
            preparedStatement.setString(3, employee.getSdt());
            preparedStatement.setString(4, employee.getEmail());
            preparedStatement.setInt(5, employee.getMaNV());
            
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        }
    }

    // Xóa nhân viên
    public boolean deleteEmployee(int maNV) throws SQLException {
        String query = "DELETE FROM EMPLOYEE WHERE MaNV = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, maNV);
            
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        }
    }
}
