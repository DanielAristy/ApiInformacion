package com.example.apiinformacion.controller;

import com.example.apiinformacion.entity.Vehiculo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/control-vehiculo")
public class VehiculoController {

    /**Tansacciones*/

    /**Buscar vehiculos por la placa*/
    public Vehiculo findById(String placa){
        return null;
    }

    /**Insertar un vehiculo*/
    public void insertar(Vehiculo vehiculo){

    }

    /**Actualizar vehiculo y su placa*/
    public void actualizar(Vehiculo vehiculo, String placa){

    }

    /**Eliminar  un vehiculo por la placa*/
    public void eliminar(String placa){

    }
    /**listar vehiculos*/
    public List<Vehiculo> listar(){
        return null;
    }

}
