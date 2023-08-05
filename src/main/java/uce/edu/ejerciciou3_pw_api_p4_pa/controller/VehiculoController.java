package uce.edu.ejerciciou3_pw_api_p4_pa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uce.edu.ejerciciou3_pw_api_p4_pa.model.Vehiculo;
import uce.edu.ejerciciou3_pw_api_p4_pa.services.IVehiculoService;

@RestController
@RequestMapping(path = "/vehiculos")
public class VehiculoController {
    
    @Autowired
    private IVehiculoService vehiculoService;

    @GetMapping(path = "/{placa}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Vehiculo> consultaPlaca(@PathVariable String placa){

        return new ResponseEntity<Vehiculo>(this.vehiculoService.consultarPorPlaca(placa), null, 200);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Vehiculo>> consultarTodos(@PathVariable String placa){

        // Link myLink = linkTo(methodOn(VehiculoController.class).consultaPlaca(VehiculoTO.getId())).withRel("algo");
        // VehiculoTO.add(myLink);
        return new ResponseEntity<List<Vehiculo>>(this.vehiculoService.buscarTodos(), null, 0);
    }
}
