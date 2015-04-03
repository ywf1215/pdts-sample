package com.pactera.pdts.interfaces.booking.facade.internal.assembler;

import com.pactera.pdts.domain.model.room.Room;
import com.pactera.pdts.interfaces.booking.facade.dto.RoomDTO;

public class RoomDTOAssembler {
	
	public RoomDTO toDTO(Room room) {
		
		final RoomDTO roomDTO = new RoomDTO(room.idString(), room.hotel().name(), room.hotel().detail().star());
		return roomDTO;
		
	}

}
