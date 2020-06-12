package com.example.apiinformacion.controller;

import com.example.apiinformacion.entity.Vehiculo;
import com.example.apiinformacion.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/control-vehiculo")
public class VehiculoController {


    /**Inyeccion de dependecias*/
    @Autowired
    private VehiculoService vehiculoService;

    /**Tansacciones*/

    /**Buscar vehiculos por la placa*/
    public Vehiculo findById(String placa){
        return vehiculoService.findById(placa);
    }

    /**Insertar un vehiculo*/
    public void insertar(Vehiculo vehiculo){
        vehiculoService.insert(vehiculo);
    }

    /**Actualizar vehiculo y su placa*/
    public void actualizar(Vehiculo vehiculo, String placa){
        vehiculo.setPlaca(placa);
        vehiculoService.update(vehiculo);
    }

    /**Eliminar  un vehiculo por la placa*/
    public void eliminar(String placa){

        vehiculoService.delete(placa);
    }
    /**listar vehiculos*/
    public List<Vehiculo> listar(){
        return vehiculoService.findAll();
    }

}
