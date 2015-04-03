package com.pactera.pdts.domain.model.hotel;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;

import com.pactera.pdts.domain.shared.ValueObject;

public class HotelInfo implements ValueObject<HotelInfo> {
	
	private int star;
	private List<String> hotelers;
	private String license;
	
	public HotelInfo(int start, List<String> hotelers, String license) {
		this.star = start;
		this.hotelers = hotelers;
		this.license = license;
	}

	@Override
	public boolean sameValueAs(HotelInfo other) {
		return other != null && new EqualsBuilder().
			      append(this.star, other.star).
			      append(this.hotelers, other.hotelers).
			      append(this.license, other.license).
			      isEquals();
	}
	
	public List<String> hotelers() {
		return Collections.unmodifiableList(hotelers);
	}
	
	public int star() {
		return star;
	}

}
