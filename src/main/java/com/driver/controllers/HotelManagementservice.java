package com.driver.controllers;

import com.driver.model.Hotel;
import com.driver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelManagementservice {
    HotelManagementRepository hotelManagementRepository = new HotelManagementRepository();

    public String addHotel(Hotel hotel) {
        return hotelManagementRepository.saveHotel(hotel);
    }

    public Integer addUser(User user) {
        return hotelManagementRepository.saveUser(user);
    }
}
