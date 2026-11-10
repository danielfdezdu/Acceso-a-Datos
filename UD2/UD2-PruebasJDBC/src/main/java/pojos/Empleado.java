package pojos;

public class Empleado {
	
	private int employeeID;
	private String firstName;
	private String lasyName;
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasyName() {
		return lasyName;
	}
	public void setLasyName(String lasyName) {
		this.lasyName = lasyName;
	}
	
	@Override
	public String toString() {
		return "Empleado [employeeID=" + employeeID + ", firstName=" + firstName + ", lasyName=" + lasyName + "]";
	}
	
	public Empleado(int employeeID, String firstName, String lasyName) {
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lasyName = lasyName;
	}		

	public Empleado() {
	}

}
