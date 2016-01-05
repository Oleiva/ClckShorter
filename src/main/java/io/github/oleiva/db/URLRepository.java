package io.github.oleiva.db;

import com.google.code.morphia.Morphia;
import com.google.code.morphia.dao.BasicDAO;
import com.mongodb.Mongo;
import org.bson.types.ObjectId;

public class URLRepository extends BasicDAO<URLData, ObjectId>  {

    public URLRepository(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }

}
