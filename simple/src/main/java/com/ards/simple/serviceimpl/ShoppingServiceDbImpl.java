package com.ards.simple.serviceimpl;

import com.ards.simple.entities.Shopping;
import com.ards.simple.repositories.ShoppingRepository;
import com.ards.simple.services.ShoppingService;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShoppingServiceDbImpl implements ShoppingService {

    @Autowired
    ShoppingRepository repository;

    @Override
    public Shopping saveShopping(Shopping shopping) {
        return repository.save(shopping);
    }

    @Override
    public List<Shopping> getAllShopping() {
        return repository.findAll();
    }

    @Override
    public Shopping getShoppingById(String id) {
        Shopping shp = null;
        if (repository.findById(id).isPresent()) {
            shp = repository.findById(id).get();
        }
        return shp;
    }

    @Override
    public Shopping updateShopping(Shopping shopping) {
        return repository.save(shopping);
    }

    @Override
    public void deleteShoppingById(String id) {
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
        }
    }
}
