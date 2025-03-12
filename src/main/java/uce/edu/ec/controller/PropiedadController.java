package uce.edu.ec.controller;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import uce.edu.ec.repository.model.Propiedad;
import uce.edu.ec.service.IPropiedadServ;

@Path("/propiedades")
//@Consumes("MediaType.APPLICATION_JSON")
//@Produces("MediaType.APPLICATION_JSON")
public class PropiedadController {

    @Inject
    IPropiedadServ propiedadServ;

    @POST
    public void insertar(Propiedad propiedad) {
        this.propiedadServ.insertar(propiedad);
    }

    @GET
    public List<Propiedad> buscartodo() {
        List<Propiedad> propiedades = this.propiedadServ.buscartodo();
        return propiedades;
    }
}
