package org.cap.service;

import java.util.List;

import org.cap.entities.Customer;

public interface ICustomerService {
	Customer findById(int cid);
	 Customer update(Customer customer);
    Customer register(Customer customer);
    Boolean delete(int cid);
    List<Customer> fetchAll();
}
