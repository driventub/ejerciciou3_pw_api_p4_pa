package uce.edu.ejerciciou3_pw_api_p4_pa.repository;

import java.util.List;

import uce.edu.ejerciciou3_pw_api_p4_pa.model.Vehiculo;

public interface IVehiculoRepo {
    public Vehiculo consultarPlaca(String placa);
    public List<Vehiculo> buscarTodos();
}
