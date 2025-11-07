package com.evrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.evrental.model.EVRenter;
import com.evrental.service.EVRenterService;

@RestController
@RequestMapping("/api/evrenter")
public class EVRenterController {

    @Autowired
    private EVRenterService evRenterService;

    @PostMapping("/register")
    public EVRenter register(@RequestBody EVRenter evRenter) {
        return evRenterService.register(evRenter);
    }

    @GetMapping("/{id}")
    public EVRenter getEVRenter(@PathVariable Long id) {
        return evRenterService.getEVRenterById(id);
    }
}
