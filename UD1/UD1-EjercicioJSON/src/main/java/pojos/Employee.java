package pojos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Employee {
	private int id;
	private String name;
	private boolean permanent;
	private Address address;
	private long[] phoneNumber;
	private String role;
	private List<String> cities;
	private Map<String, String> properties;
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long[] getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", permanent=" + permanent + ", address=" + address
				+ ", phoneNumber=" + Arrays.toString(phoneNumber) + ", role=" + role + ", cities=" + cities
				+ ", properties=" + properties + "]";
	}
	
	public static Employee createEmployee() {
		return Employee;
	}
	
}
