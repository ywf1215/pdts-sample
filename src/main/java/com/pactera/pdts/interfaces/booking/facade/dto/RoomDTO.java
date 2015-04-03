package com.pactera.pdts.interfaces.booking.facade.dto;

import java.io.Serializable;

public class RoomDTO implements Serializable {
	
	private final String roomNum;
	private final String hotelName;
	private final int star;
	
	public RoomDTO(String roomNum, String hotelName, int star) {
		super();
		this.roomNum = roomNum;
		this.hotelName = hotelName;
		this.star = star;
	}
	
	public String getRoomNum() {
		return roomNum;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	
	public int getStar() {
		return star;
	}
}
