package com.pactera.pdts.interfaces.booking.facade.internal;

import com.pactera.pdts.application.BookingService;
import com.pactera.pdts.domain.model.location.UnLocode;
import com.pactera.pdts.domain.model.room.Room;
import com.pactera.pdts.domain.model.room.RoomRepository;
import com.pactera.pdts.interfaces.booking.facade.BookingServiceFacade;
import com.pactera.pdts.interfaces.booking.facade.dto.RoomDTO;
import com.pactera.pdts.interfaces.booking.facade.internal.assembler.RoomDTOAssembler;

public class BookingServiceFacadeImpl implements BookingServiceFacade {
	
	private BookingService bookingService;
	private RoomRepository roomRepository;

	@Override
	public String bookingNewRoom(String hotelId, UnLocode unLocode) {
		String roomNum = bookingService.bookingNewRoom(hotelId, unLocode);
		return roomNum;
	}

	@Override
	public RoomDTO loadRoomForBooking(String roomNum) {
		Room room = roomRepository.load(roomNum);
		final RoomDTOAssembler roomDTOAssembler = new RoomDTOAssembler();
		return roomDTOAssembler.toDTO(room);
	}
	
	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	public void setRoomRepository(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

}
