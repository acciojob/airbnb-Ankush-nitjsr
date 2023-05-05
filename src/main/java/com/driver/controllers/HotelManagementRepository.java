package com.driver.controllers;

import com.driver.model.Hotel;
import com.driver.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class HotelManagementRepository {
    Map<String, Hotel> hotelDb;
    Map<Integer, User> userDb;

    public HotelManagementRepository() {
        this.hotelDb = new HashMap<String, Hotel>();
        this.userDb = new HashMap<Integer, User>();
    }

    public String saveHotel(Hotel hotel) {
        if (hotel.getHotelName().equals(null) || hotel == null) return "FAILURE";
        if (hotelDb.containsKey(hotel.getHotelName())) return "FAILURE";
        hotelDb.put(hotel.getHotelName(), hotel);
        return "SUCCESS";
    }

    public Integer saveUser(User user) {
        if (userDb.containsKey(user.getaadharCardNo())) return 0;
        userDb.put(user.getaadharCardNo(), user);
        return user.getaadharCardNo();
    }
}
