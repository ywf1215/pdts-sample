package com.pactera.pdts.infrastructure.persistence.mybatis;

import java.util.UUID;

import com.pactera.pdts.domain.model.room.Room;
import com.pactera.pdts.domain.model.room.RoomRepository;
import com.pactera.pdts.infrastructure.persistence.mybatis.mapper.RoomMapper;

public class RoomRepositoryMybatis implements RoomRepository {
	
	private RoomMapper roomMapper;

	@Override
	public String nextRoomId() {
		final String random = UUID.randomUUID().toString().toUpperCase();
		return random.substring(0, random.indexOf("-"));
	}

	@Override
	public void store(Room room) {
		roomMapper.store(room);
	}

	@Override
	public Room load(String roomNum) {
		return roomMapper.find(roomNum);
	}

	public void setRoomMapper(RoomMapper roomMapper) {
		this.roomMapper = roomMapper;
	}
}
