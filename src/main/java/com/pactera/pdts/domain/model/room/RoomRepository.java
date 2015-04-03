package com.pactera.pdts.domain.model.room;


/**
 * 
 * @author wenhui.yang
 *
 */
public interface RoomRepository {
	
	public String nextRoomId();
	
	public void store(Room room);
	
	public Room load(String roomNum);

}
