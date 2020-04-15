package org.cap.service;

import java.util.List;

import org.cap.dao.ICustomerDao;
import org.cap.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
	 private ICustomerDao customerDao;

	   

	public ICustomerDao getCustomerDao() {
		return customerDao;
	}
	@Autowired
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer findById(int cid) {
		return customerDao.findById(cid);
	}

	@Override
	public Customer register(Customer customer) {
		 return customerDao.register(customer);
	}
	@Override
	public Customer update(Customer customer) {
		return customerDao.update(customer);
	}
	@Override
	public Boolean delete(int cid) {
		return customerDao.delete(cid);
	}
	@Override
	public List<Customer> fetchAll() {
		return customerDao.fetchAll();
	}

}
