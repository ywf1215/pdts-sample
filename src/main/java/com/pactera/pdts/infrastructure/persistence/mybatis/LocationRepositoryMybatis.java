package com.pactera.pdts.infrastructure.persistence.mybatis;

import java.util.List;

import com.pactera.pdts.domain.model.location.Location;
import com.pactera.pdts.domain.model.location.LocationRepository;
import com.pactera.pdts.domain.model.location.UnLocode;
import com.pactera.pdts.infrastructure.persistence.mybatis.mapper.LocationMapper;

public class LocationRepositoryMybatis implements LocationRepository {
	
	private LocationMapper locationMapper;

	@Override
	public Location find(UnLocode unLocode) {
		return locationMapper.find(unLocode.idString());
	}

	@Override
	public List<Location> findAll() {
		return locationMapper.findAll();
	}

	public void setLocationMapper(LocationMapper locationMapper) {
		this.locationMapper = locationMapper;
	}
}
