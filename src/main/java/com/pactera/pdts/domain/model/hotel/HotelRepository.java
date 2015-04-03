package com.pactera.pdts.domain.model.hotel;

public interface HotelRepository {
	
	Hotel find(String hotelId);
	
	void strore(Hotel hotel);

}
