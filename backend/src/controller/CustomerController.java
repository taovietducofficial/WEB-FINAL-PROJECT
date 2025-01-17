package controller;

import dao.CustomerDAO;
import model.Customer;

import java.util.List;

public class CustomerController {
    private CustomerDAO customerDAO;

    public CustomerController() {
        this.customerDAO = new CustomerDAO();
    }

    // Lấy tất cả khách hàng
    public List<Customer> getAllCustomers() {
        try {
            return customerDAO.getAllCustomers();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Thêm khách hàng mới
    public boolean addCustomer(Customer customer) {
        try {
            return customerDAO.addCustomer(customer);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Cập nhật thông tin khách hàng
    public boolean updateCustomer(Customer customer) {
        try {
            return customerDAO.updateCustomer(customer);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Xóa khách hàng
    public boolean deleteCustomer(int customerId) {
        try {
            return customerDAO.deleteCustomer(customerId);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
