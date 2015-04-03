package com.pactera.pdts.domain.model.room;

import com.pactera.pdts.domain.model.hotel.Hotel;
import com.pactera.pdts.domain.model.location.Location;
import com.pactera.pdts.domain.shared.Entity;

public class Room implements Entity<Room> {
	
	private String roomNum;
	private Hotel hotel;
	private Location location;
	
	public Room(String roomNum, Hotel hotel, Location location) {
		this.roomNum = roomNum;
		this.hotel = hotel;
		this.location = location;
	}

	@Override
	public boolean sameIdentityAs(Room other) {
		return other != null && roomNum == other.roomNum;
	}
	
	public String idString() {
		return roomNum;
	}
	
	public Hotel hotel() {
		return hotel;
	}
	

}
