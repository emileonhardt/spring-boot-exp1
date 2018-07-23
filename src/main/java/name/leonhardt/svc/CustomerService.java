package name.leonhardt.svc;

import name.leonhardt.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public long countCustomers() {
        return customerRepository.findAllAndStream().count();
    }

}
