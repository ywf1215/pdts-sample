package com.pactera.pdts.infrastructure.persistence.mybatis;

import com.pactera.pdts.domain.model.hotel.Hotel;
import com.pactera.pdts.domain.model.hotel.HotelRepository;
import com.pactera.pdts.infrastructure.persistence.mybatis.mapper.HotelMapper;

public class HotelRepositoryMybatis implements HotelRepository {
	
	private HotelMapper hotelMapper;

	@Override
	public Hotel find(String hotelId) {
		
		return hotelMapper.find(hotelId);
	}

	@Override
	public void strore(Hotel hotel) {
	}
	
	
	public void setHotelMapper(HotelMapper hotelMapper) {
		this.hotelMapper = hotelMapper;
	}
}
