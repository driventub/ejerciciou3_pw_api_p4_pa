package uce.edu.ejerciciou3_pw_api_p4_pa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uce.edu.ejerciciou3_pw_api_p4_pa.model.Vehiculo;
import uce.edu.ejerciciou3_pw_api_p4_pa.repository.IVehiculoRepo;
import uce.edu.ejerciciou3_pw_api_p4_pa.services.to.VehiculoTO;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

    @Autowired
    private IVehiculoRepo vehiculoRepo;

    @Override
    public Vehiculo consultarPorPlaca(String placa) {
        return this.vehiculoRepo.consultarPlaca(placa);
    }

    

    @Override
    public List<Vehiculo> buscarTodos() {
        return this.vehiculoRepo.buscarTodos();
    }
    
    public VehiculoTO convertir(Vehiculo vehiculo){
        VehiculoTO vehiculoTO = new VehiculoTO();
        vehiculoTO.setId(vehiculo.getId());
        vehiculoTO.setPlaca(vehiculo.getPlaca());
        vehiculoTO.setMarca(vehiculo.getMarca());
        vehiculoTO.setModelo(vehiculo.getModelo());
        vehiculoTO.setAnio(vehiculo.getAnio());
        return vehiculoTO;
    }



    @Override
    public VehiculoTO visualizarPorPlaca(String placa) {
        return null;
    }
    
}
