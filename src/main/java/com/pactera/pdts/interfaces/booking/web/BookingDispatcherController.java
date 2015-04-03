package com.pactera.pdts.interfaces.booking.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pactera.pdts.interfaces.booking.facade.BookingServiceFacade;
import com.pactera.pdts.interfaces.booking.facade.dto.RoomDTO;

@Controller
public class BookingDispatcherController {

	@Autowired
	private BookingServiceFacade bookingServiceFacade;

	@RequestMapping("/showRoom.do")
	public ModelAndView showRoom(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String roomNum = request.getParameter("roomNum");
		RoomDTO dto = bookingServiceFacade.loadRoomForBooking(roomNum);
		map.put("room", dto);
		return new ModelAndView("OK");
	}
	
}
