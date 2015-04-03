package com.pactera.pdts.interfaces.booking.facade;

import com.pactera.pdts.domain.model.location.UnLocode;
import com.pactera.pdts.interfaces.booking.facade.dto.RoomDTO;

public interface BookingServiceFacade {
	
	String bookingNewRoom(String hotelId, UnLocode unLocode);
	
	RoomDTO loadRoomForBooking(String roomNum);

}
