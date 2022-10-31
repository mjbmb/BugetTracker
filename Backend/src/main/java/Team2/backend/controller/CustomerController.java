package Team2.backend.controller;

import Team2.backend.entity.Customer;
import Team2.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/restapi/customers")
    public String listCustomers(Model model){
        model.addAttribute("customers", customerService.getAllCustomers());
        return model.toString();
    }

    @GetMapping("/restapi/customers/{id}")
    public String getCustomer(Model model, @PathVariable("id") long id){
        model.addAttribute("customers", customerService.getCustomer(id));
        return model.toString();
    }

    @PutMapping("restapi/customers/{id}")
    public Customer updateCustomer(@PathVariable("id") long id, Model model){
        model.addAttribute("customer", customerService.updateCustomer(id));
        return (Customer) model.getAttribute("customer");
    }

    @PostMapping("restapi/customers")
    public Customer saveCustomer(Customer customer){
        return customerService.saveCustomer(customer);
    }
}
