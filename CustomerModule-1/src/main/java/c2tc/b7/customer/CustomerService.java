package c2tc.b7.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class CustomerService
{
	@Autowired
	private CustomerRepository repository;

	public Customer get(Integer id) {
		return repository.findById(id).get();
	}

	public void delete(Integer id) {
		repository.deleteById(id);

	}

	public void save(Customer Customer) {
		repository.save(Customer);
		
	}

	public List<Customer> listAll() {
		return repository.findAll();
	}

}
