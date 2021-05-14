package com.company.Customer.Adress;

public class Customer extends Address{
	private Address obj;
	private int customerId;
	private String customerName;
	private int customerContact;
	private String customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
    public void customerdetails() {
    	System.out.println("Customer Id is"+getCustomerId());
    	System.out.println("Customer Name is"+getCustomerName());
    	System.out.println("Customer Contact numeber is"+getCustomerContact());
    	System.out.println("Customer Address is "+obj.getStreet()+","+obj.getCity()+","+obj.getZip()+","+obj.getState()+","+obj.getCountry());
    }
}
