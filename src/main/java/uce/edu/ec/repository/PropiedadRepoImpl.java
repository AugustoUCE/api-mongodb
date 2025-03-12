package uce.edu.ec.repository;

import java.util.ArrayList;
import java.util.List;

import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;

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

    @Override
    public List<Propiedad> buscartodo() {

        return getCollection().find().into(new ArrayList<>());
    }

    @Override
    public void actualizar(ObjectId id) {
        //actualizar la propiedad
        Bson filter = eq("_id", new ObjectId(id.toString()));
        Bson updateOperation = set("autor", "nuevo nombre");
        

        this.getCollection().updateOne(filter, updateOperation);

    }

    @Override
    public void eliminar(ObjectId id) {
        
    }

 
    

}
