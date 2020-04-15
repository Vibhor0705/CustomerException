package org.cap.dao;

import java.util.List;

import org.cap.entities.Customer;


public interface ICustomerDao {
	Customer findById(int cid);
	Customer update(Customer customer);
    Customer register(Customer customer);
    Boolean delete(int cid);
    List<Customer> fetchAll();
}
