package com.evrental.service;

import com.evrental.model.Vehicle;
import com.evrental.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        if (vehicleRepository.existsById(id)) {
            vehicle.setId(id);
            return vehicleRepository.save(vehicle);
        } else {
            throw new ResourceNotFoundException("Vehicle", "id", id);
        }
    }

    public void deleteVehicle(Long id) {
        if (vehicleRepository.existsById(id)) {
            vehicleRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Vehicle", "id", id);
        }
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }
}
