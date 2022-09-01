
package accountSolution2;

import accountDomain.Customer;

public interface Factory {
	
	Account create();
	
	Account create(Customer owner, double balance);
	
}
