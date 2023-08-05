package uce.edu.ejerciciou3_pw_api_p4_pa.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.ejerciciou3_pw_api_p4_pa.model.Vehiculo;

@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Vehiculo consultarPlaca(String placa) {
        TypedQuery<Vehiculo> mQuery = this.em.createQuery("SELECT  v FROM Vehiculo v WHERE v.placa =:placa ",
                Vehiculo.class);
        mQuery.setParameter("placa", placa);
        return mQuery.getSingleResult();
    }

    @Override
    public List<Vehiculo> buscarTodos() {
        TypedQuery<Vehiculo> mQuery = this.em.createQuery("SELECT Vehiculo v FROM v ", Vehiculo.class);

        return mQuery.getResultList();
    }

}
