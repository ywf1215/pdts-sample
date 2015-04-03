package com.pactera.pdts.domain.model.hotel;

import com.pactera.pdts.domain.shared.Entity;

public class Hotel implements Entity<Hotel> {
	
	private String id;
	private String name;
	private HotelInfo hotelInfo;
	
	public Hotel(String id, String name, HotelInfo hotelInfo) {
		this.id = id;
		this.name = name;
		this.hotelInfo = hotelInfo;
	}

	@Override
	public boolean sameIdentityAs(Hotel other) {
		return other != null && id == other.id;
	}
	
	public HotelInfo hotelDetail() {
		return hotelInfo;
	}
	
	public HotelInfo detail() {
		return hotelInfo;
	}
	
	public String name() {
		return name;
	}

}
