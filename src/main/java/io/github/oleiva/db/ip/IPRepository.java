/**
 *
 */
package io.github.oleiva.db.ip;

import com.google.code.morphia.Morphia;
import com.google.code.morphia.dao.BasicDAO;
import com.mongodb.Mongo;
import org.bson.types.ObjectId;


public class IPRepository extends BasicDAO<IPData, ObjectId> {

    public IPRepository(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }
}
