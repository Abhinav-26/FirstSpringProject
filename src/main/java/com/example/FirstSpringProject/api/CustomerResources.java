package com.example.FirstSpringProject.api;

import com.example.FirstSpringProject.model.Customer;
import com.example.FirstSpringProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerResources {

    @Autowired
    private CustomerService customerServiceRefer;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
         return customerServiceRefer.addCustomer(customer);
        }

    @GetMapping
    public List<Customer> getCustomers() {
     return customerServiceRefer.getCustomerList();
    }

    @GetMapping(value = "/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") int customerId) {
        return customerServiceRefer.getCustomer(customerId);
    }

    @PostMapping(value = "/{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") int customerID,@RequestBody Customer customer) {
        return customerServiceRefer.updateCustomer(customerID,customer);
    }

    @DeleteMapping(value = "/{customerId}")
    public String deleteCustomer(@PathVariable("customerId") int customerID) {
        return customerServiceRefer.deleteCustomer(customerID);
    }

}