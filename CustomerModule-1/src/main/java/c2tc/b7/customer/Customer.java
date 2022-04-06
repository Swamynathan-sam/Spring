package c2tc.b7.customer;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer
{
	private Integer id;		// long id;
	private String name;
	private List<String> order_id;
	private int phone;			
	private String email;

	public Customer(Integer id, String name, List<String> order_id, int phone, String email) 
	{
		this.id = id;
		this.name = name;
		this.order_id = order_id;
		this.phone = phone;
		this.email = email;
	}
	public Customer() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}

	
	
}
