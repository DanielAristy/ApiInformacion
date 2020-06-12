package com.example.apiinformacion.service;


import com.example.apiinformacion.entity.Vehiculo;

import java.util.List;

public interface VehiculoService {

    Vehiculo findById(String placa);

    void insert(Vehiculo vehiculo);

    void update(Vehiculo vehiculo);

    void delete(String placa);

    List<Vehiculo> findAll();
}
