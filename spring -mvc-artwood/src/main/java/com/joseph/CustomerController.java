import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
package com.joseph;

@Controller
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Request handling methods like showCustomerForm, saveCustomer, etc.
}
