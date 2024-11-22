package org.ies.vehicles;

import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.Vehicle;
import org.ies.vehicles.model.VehicleType;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(
                VehicleType.Car,
                200,
                "Rojo",
                "242ljk"
        );
        Vehicle vehicle2 = new Vehicle(
                VehicleType.Motorbike,
                100,
                "Blanco",
                "2324KLJ"
        );
        Vehicle vehicle3 = new Vehicle(
                VehicleType.Truck,
                150,
                "Negro",
                "2223PSF"
        );
        Vehicle[] vehicles = {vehicle1, vehicle2, vehicle3};
        Garage garage = new Garage( "Manolo", "C/Guardia Civil", vehicles );
        System.out.println(garage);
    }
}