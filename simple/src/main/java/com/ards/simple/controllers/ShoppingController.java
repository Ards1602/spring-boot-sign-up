package com.ards.simple.controllers;

import com.ards.simple.entities.Shopping;
import com.ards.simple.services.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shopping")
public class ShoppingController {

    @Autowired
    ShoppingService service;

    @PostMapping("")
    public Shopping createShopping(@RequestBody Shopping shp) {
        return service.saveShopping(shp);
    }

    @GetMapping("")
    public List<Shopping> getAllShopping() {
        return service.getAllShopping();
    }

    @GetMapping("/{id}")
    public Shopping getShoppingById(@PathVariable String id) {
        return service.getShoppingById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteShoppingById(@PathVariable String id) {
        service.deleteShoppingById(id);
    }


}
