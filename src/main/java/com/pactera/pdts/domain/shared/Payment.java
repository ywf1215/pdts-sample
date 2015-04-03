package com.pactera.pdts.domain.shared;

import org.apache.commons.lang.builder.EqualsBuilder;

public class Payment implements ValueObject<Payment> {
	
	private String account;
	private double amount;
	
	public Payment(String account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	@Override
	public boolean sameValueAs(Payment other) {
		return other != null && new EqualsBuilder().
			      append(this.account, other.account).
			      append(this.amount, other.amount).
			      isEquals();
	}

}
