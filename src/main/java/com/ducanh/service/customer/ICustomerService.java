package com.ducanh.service.customer;

import com.ducanh.model.Customer;
import com.ducanh.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    boolean insertWithStoredProcedure(Customer customer);
}
