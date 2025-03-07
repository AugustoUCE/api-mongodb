package uce.edu.ec.repository;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.ec.repository.model.Propiedad;

@ApplicationScoped
public class PropiedadRepoImpl implements IPropiedadRepo {

    @Inject
    MongoClient mongoClient;

    private MongoCollection<Propiedad> getCollection() {
        return mongoClient.getDatabase("miEntity").getCollection("propiedad", Propiedad.class);
    }

    @Override
    public void insertar(Propiedad propiedad) {
        getCollection().insertOne(propiedad);
    }

}
