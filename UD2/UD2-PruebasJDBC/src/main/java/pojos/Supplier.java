package pojos;

public class Supplier {
	int supplierID;
	String companyName;
	
	public int getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public Supplier() {};
	
	public Supplier(int supplierID, String companyName) {
		this.supplierID = supplierID;
		this.companyName = companyName;
	}
	
}
