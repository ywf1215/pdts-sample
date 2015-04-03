package com.pactera.pdts.application;

import com.pactera.pdts.domain.model.location.UnLocode;

public interface BookingService {
	
	String bookingNewRoom(String hotelId, UnLocode unLocode);

}
