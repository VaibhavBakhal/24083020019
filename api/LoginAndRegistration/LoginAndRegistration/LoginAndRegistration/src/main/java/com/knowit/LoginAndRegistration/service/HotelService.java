package com.knowit.LoginAndRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.knowit.LoginAndRegistration.entities.Hotel;
import com.knowit.LoginAndRegistration.entities.Role;
import com.knowit.LoginAndRegistration.repository.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
	HotelRepository hotelrepository;
	
	public Hotel getHotel(int h_id)
	{
		return hotelrepository.findById(h_id).get();
	}

}
