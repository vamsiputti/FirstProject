package org.test.tcs;

import org.test.cts.CompanyDetails;
import org.test.cts.EmployeeDetails;


public class ClientDetails {
public void clientId() {
	System.out.println("client ID:5698");
	}
public void clientName() {
	System.out.println("client name:khhhiran");
	
}
public static void main(String[] args) {
	ClientDetails cd=new ClientDetails();
	cd.clientId();
	cd.clientName();
	CompanyDetails c=new CompanyDetails();
	c.compId();
	c.compName();
	EmployeeDetails e=new EmployeeDetails();
	e.emplId();
	e.empName();
	e.emplId();
	e.emplId();

}

}
