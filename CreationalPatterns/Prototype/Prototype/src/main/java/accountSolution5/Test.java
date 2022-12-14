
package accountSolution5;

import accountDomain.Customer;

public class Test {
	public static void main(String[] args) {

		// Normal account. Credit amount is fixed at 1000.
		Account normalAccount = Account.createNormalAccount(new Customer("Remzi"), 4500);
		normalAccount.setIban("2");
		System.out.println(normalAccount.isOpenToWithdraw());
		System.out.println(normalAccount.isOpenToPayment());
		System.out.println(normalAccount.isOpenToTransfer());

		System.out.println();

		// Negative account
		Account negativeAccount = Account.createNegativeAccount(new Customer("Mustafa"), -750);
		System.out.println(negativeAccount.isOpenToWithdraw());
		System.out.println(negativeAccount.isOpenToPayment());
		System.out.println(negativeAccount.isOpenToTransfer());

		System.out.println();
		// Frozen default account
		Account frozenAccount = Account.createFrozenAccount(new Customer("Sukran"), -1000);
		System.out.println(frozenAccount.isOpenToWithdraw());
		System.out.println(frozenAccount.isOpenToPayment());
		System.out.println(frozenAccount.isOpenToTransfer());
	}
}
