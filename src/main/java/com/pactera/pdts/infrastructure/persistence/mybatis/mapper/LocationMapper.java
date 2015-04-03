package com.pactera.pdts.infrastructure.persistence.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.pactera.pdts.domain.model.location.Location;


/**
 * 
 * @author wenhui.yang
 *
 */
public interface LocationMapper {
	
	@Select("SELECT * FROM location WHERE id = #{id}") 
	Location find(@Param("id") String id);
	
	@Select("SELECT * FROM location")
	List<Location> findAll();

}
