package Team2.backend.service;

import Team2.backend.entity.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomer(long id);
    Customer updateCustomer(long id);

    Customer saveCustomer(Customer customer);

    void deleteCustomer(long id);

}
