package uce.edu.ejerciciou3_pw_api_p4_pa.services;

import java.util.List;

import uce.edu.ejerciciou3_pw_api_p4_pa.model.Vehiculo;
import uce.edu.ejerciciou3_pw_api_p4_pa.services.to.VehiculoTO;

public interface IVehiculoService {
    public Vehiculo consultarPorPlaca(String placa);
    public List<Vehiculo> buscarTodos();
    public VehiculoTO visualizarPorPlaca(String placa);
}
