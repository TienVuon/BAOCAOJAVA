package com.evrental.service;

import com.evrental.model.EVRenter;
import com.evrental.repository.EVRenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EVRenterService {

    @Autowired
    private EVRenterRepository evRenterRepository;

    public EVRenter register(EVRenter evRenter) {
        return evRenterRepository.save(evRenter);
    }

    public EVRenter getEVRenterById(Long id) {
        return evRenterRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("EVRenter", "id", id));
    }
}
