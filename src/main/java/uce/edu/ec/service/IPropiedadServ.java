package uce.edu.ec.service;

import java.util.List;

import uce.edu.ec.repository.model.Propiedad;

public interface IPropiedadServ {
      void insertar(Propiedad propiedad);
      List<Propiedad> buscartodo();

}
