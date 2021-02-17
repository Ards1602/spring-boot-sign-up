package com.ards.simple.services;

import com.ards.simple.entities.Shopping;

import java.util.List;

public interface ShoppingService {

    Shopping saveShopping(Shopping shopping);
    List<Shopping> getAllShopping();
    Shopping getShoppingById(String id);
    Shopping updateShopping(Shopping shopping);
    void deleteShoppingById(String id) ;

}
