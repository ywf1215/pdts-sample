package com.pactera.pdts.application.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pactera.pdts.application.BookingService;
import com.pactera.pdts.domain.model.hotel.Hotel;
import com.pactera.pdts.domain.model.hotel.HotelRepository;
import com.pactera.pdts.domain.model.location.Location;
import com.pactera.pdts.domain.model.location.LocationRepository;
import com.pactera.pdts.domain.model.location.UnLocode;
import com.pactera.pdts.domain.model.room.Room;
import com.pactera.pdts.domain.model.room.RoomRepository;
import com.pactera.pdts.domain.service.PaymentService;
import com.pactera.pdts.domain.shared.Payment;

public class BookingServiceImpl implements BookingService {
	
	private final LocationRepository locationRepository;
	private final RoomRepository roomRepository;
	private final HotelRepository hotelRepository;
	private final PaymentService paymentService;
	private final Log logger = LogFactory.getLog(getClass());
	
	public BookingServiceImpl(LocationRepository locationRepository, RoomRepository roomRepository, 
			HotelRepository hotelRepository, PaymentService paymentService) {
		this.locationRepository = locationRepository;
		this.roomRepository = roomRepository;
		this.hotelRepository = hotelRepository;
		this.paymentService = paymentService;
	}



	@Override
	public String bookingNewRoom(String hotelId, UnLocode unLocode) {
		
		Hotel hotel = hotelRepository.find(hotelId);
		String roomNum = roomRepository.nextRoomId();
		Location location = locationRepository.find(unLocode);
		
		Room room = new Room(roomNum, hotel, location);
		
		roomRepository.store(room);
		logger.info("Booked new room with room id " + room.idString());
		
		Payment payment = new Payment("156545846554", 503.2);
		paymentService.pay(payment);
		
		return room.idString();
	}

}
