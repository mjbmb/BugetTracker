package Team2.backend.implementations;

import Team2.backend.entity.Customer;
import Team2.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Team2.backend.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }
    @Override
    public Customer getCustomer(long id){
        if(!customerRepository.existsById(id)){
            throw new RuntimeException("There is no Customer with the id "+id+" found.");
        }
        if(customerRepository.findById(id).isEmpty()){
            throw new RuntimeException("No response has been received from the database.");
        }
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer updateCustomer(long id) {
        customerRepository.save(this.getCustomer(id));
        return this.getCustomer(id);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        customerRepository.save(customer);
        return this.getCustomer(customer.getId());
    }

    @Override
    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }
}
