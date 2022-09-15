package com.ducanh.repository.procedure;

import com.ducanh.model.Customer;

public interface ICustomerRepoSP {
    boolean insertWithStoreProcedure(Customer customer);
}
