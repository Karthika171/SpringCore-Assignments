package com.assignment;


public abstract class BankActRImpl implements BankActR {
	
	private void BankAccountRepositoryImpl(){
	  BankAct bankaccount = new BankAct();
	  bankaccount.setAccountHolderName("sai");
	  bankaccount.setAccountId(55);
	  bankaccount.setAccountType("Savings");
	  bankaccount.setAccountBalance((long) 21132.4);


	}
}
