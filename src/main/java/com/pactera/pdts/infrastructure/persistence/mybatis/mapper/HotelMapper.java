package com.pactera.pdts.infrastructure.persistence.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.pactera.pdts.domain.model.hotel.Hotel;


/**
 * 
 * @author wenhui.yang
 *
 */
public interface HotelMapper {
	
	@Select("SELECT id, name FROM hotel WHERE id = #{id}") 
	Hotel find(@Param("id") String hotelId);
	
}
