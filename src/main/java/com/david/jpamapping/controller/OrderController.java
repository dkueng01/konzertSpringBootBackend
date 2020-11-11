package com.david.jpamapping.controller;

import com.david.jpamapping.dto.OrderRequest;
import com.david.jpamapping.model.Besucher;
import com.david.jpamapping.repository.BesucherRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OrderController {
    @Autowired
    private BesucherRepositry besucherRepositry;

    @PostMapping("/placeOrder")
    public Besucher placeOrder(@RequestBody OrderRequest request){
        return besucherRepositry.save(request.getBesucher());
    }

    @GetMapping("/findAllOrders")
    public List<Besucher> findAllOrders(){
        return besucherRepositry.findAll();
    }
}
