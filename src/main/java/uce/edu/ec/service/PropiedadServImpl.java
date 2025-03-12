package uce.edu.ec.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.ec.repository.IPropiedadRepo;
import uce.edu.ec.repository.model.Propiedad;

@ApplicationScoped
public class PropiedadServImpl implements IPropiedadServ {

    @Inject
    IPropiedadRepo propiedadRepo;

    @Override
    public void insertar(Propiedad propiedad) {
        this.propiedadRepo.insertar(propiedad);
    }

    @Override
    public List<Propiedad> buscartodo() {
        return this.propiedadRepo.buscartodo();
         
    }
    
    
}
