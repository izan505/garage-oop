package org.ies.vehicles.model;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private String nombre;
    private String direcciones;
    private Vehicle[] vehiculos;

    public Garage(String nombre, String direcciones, Vehicle[] vehiculos) {
        this.nombre = nombre;
        this.direcciones = direcciones;
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(String direcciones) {
        this.direcciones = direcciones;
    }

    public Vehicle[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehicle[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(nombre, garage.nombre) && Objects.equals(direcciones, garage.direcciones) && Objects.deepEquals(vehiculos, garage.vehiculos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, direcciones, Arrays.hashCode(vehiculos));
    }

    @Override
    public String toString() {
        return "Garage{" +
                "nombre='" + nombre + '\'' +
                ", direcciones='" + direcciones + '\'' +
                ", vehiculos=" + Arrays.toString(vehiculos) +
                '}';
    }
}
