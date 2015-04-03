package com.pactera.pdts.domain.model.hotel;

import org.apache.commons.lang.builder.EqualsBuilder;

import com.pactera.pdts.domain.shared.ValueObject;

public class Hoteler implements ValueObject<Hoteler> {
	
	private String name;
	private int age;
	private String gender;
	
	public Hoteler(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public boolean sameValueAs(Hoteler other) {
		return other != null && new EqualsBuilder().
			      append(this.name, other.name).
			      append(this.age, other.age).
			      append(this.gender, other.gender).
			      isEquals();
	}

}
