package dao;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    // Lấy tất cả khách hàng
    public List<Customer> getAllCustomers() throws SQLException {
        List<Customer> customers = new ArrayList<>();
        String query = "SELECT * FROM CUSTOMER";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                customers.add(new Customer(
                    resultSet.getInt("MaKH"),
                    resultSet.getString("TenKH"),
                    resultSet.getString("DiaChi"),
                    resultSet.getString("SDT"),
                    resultSet.getString("Email"),
                    resultSet.getString("LichSuMuaHang")
                ));
            }
        }
        return customers;
    }

    // Thêm khách hàng mới
    public boolean addCustomer(Customer customer) throws SQLException {
        String query = "INSERT INTO CUSTOMER (TenKH, DiaChi, SDT, Email, LichSuMuaHang) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getAddress());
            preparedStatement.setString(3, customer.getPhone());
            preparedStatement.setString(4, customer.getEmail());
            preparedStatement.setString(5, customer.getPurchaseHistory());
            
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Trả về true nếu có ít nhất 1 dòng bị ảnh hưởng (thêm thành công)
        }
    }

    // Sửa thông tin khách hàng
    public boolean updateCustomer(Customer customer) throws SQLException {
        String query = "UPDATE CUSTOMER SET TenKH = ?, DiaChi = ?, SDT = ?, Email = ?, LichSuMuaHang = ? WHERE MaKH = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getAddress());
            preparedStatement.setString(3, customer.getPhone());
            preparedStatement.setString(4, customer.getEmail());
            preparedStatement.setString(5, customer.getPurchaseHistory());
            preparedStatement.setInt(6, customer.getId());
            
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Trả về true nếu có ít nhất 1 dòng bị ảnh hưởng (sửa thành công)
        }
    }

    // Xóa khách hàng theo ID
    public boolean deleteCustomer(int customerId) throws SQLException {
        String query = "DELETE FROM CUSTOMER WHERE MaKH = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, customerId);
            
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Trả về true nếu có ít nhất 1 dòng bị ảnh hưởng (xóa thành công)
        }
    }
}
