package uce.edu.ec.repository;

import java.util.List;

import org.bson.types.ObjectId;

import uce.edu.ec.repository.model.Propiedad;

public interface IPropiedadRepo {

    void insertar(Propiedad propiedad);

    List<Propiedad> buscartodo();

    void actualizar(ObjectId id);

    void eliminar(ObjectId id);
    
}
