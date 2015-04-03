package com.pactera.pdts.infrastructure.persistence.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.pactera.pdts.domain.model.room.Room;

public interface RoomMapper {
	
	@Insert("INSERT INTO room(id) VALUES(#{roomNum})")
	void store(Room room);
	
	@Select("SELECT * FROM room WHERE roomNum = #{roomNum}") 
	Room find(@Param("roomNum") String roomNum);

}
