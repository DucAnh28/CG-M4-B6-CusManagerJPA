package com.ducanh.service.customer;

import com.ducanh.model.Customer;
import com.ducanh.repository.customer.ICustomerRepo;
import com.ducanh.repository.procedure.ICustomerRepoSP;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepo customerRepository;
    @Autowired
    private ICustomerRepoSP customerRepoSP;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        return customerRepoSP.insertWithStoreProcedure(customer);
    }
}
