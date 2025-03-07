package uce.edu.ec.repository.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MongoEntity(collection = "propiedad")
public class Propiedad {

    @BsonId
    @BsonProperty("prop_id")
    private ObjectId id;

    @BsonProperty("prop_autor")
    private String autor;

}
