package com.example.apiinformacion.controller;

import com.example.apiinformacion.entity.Vehiculo;
import com.example.apiinformacion.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/control-vehiculo")
public class VehiculoController {


    /**Inyeccion de dependecias*/
    @Autowired
    private VehiculoService vehiculoService;

    /**Tansacciones*/

    /**+ GetMapping Obtener recuersos
     * + PostMapping para insertar
     * + PutMapping
     * + RequestBody en la peticion de la peticion Http vamos a enviar un objeto
     * + PathVariable enviar variables por el protocolo Http
     * */

    /**Buscar vehiculos por la placa*/
    @GetMapping("/{placa}/vehiculo")
    public Vehiculo findById(@PathVariable String placa){
        return vehiculoService.findById(placa);
    }

    /**Insertar un vehiculo*/
    @PostMapping("/vehiculo")
    public void insertar(@RequestBody Vehiculo vehiculo){
        vehiculoService.insert(vehiculo);
    }

    /**Actualizar vehiculo y su placa*/
    @PutMapping("/{placa}/vehiculo")
    public void actualizar(@RequestBody Vehiculo vehiculo, @PathVariable String placa){
        vehiculo.setPlaca(placa);
        vehiculoService.update(vehiculo);
    }

    /**Eliminar  un vehiculo por la placa*/
    @DeleteMapping("/{placa}/vehiculo")
    public void eliminar(@PathVariable String placa){

        vehiculoService.delete(placa);
    }
    /**listar vehiculos*/
    @GetMapping("/vehiculos")
    public List<Vehiculo> listar(){
        return vehiculoService.findAll();
    }

}
