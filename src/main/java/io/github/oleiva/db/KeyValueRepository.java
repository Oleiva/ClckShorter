package io.github.oleiva.db;

import com.google.code.morphia.Morphia;
import com.google.code.morphia.dao.BasicDAO;
import com.mongodb.Mongo;

public class KeyValueRepository extends BasicDAO<KeyValue, String> {

    public static final String NEXT_SHORT_URL_KEY = "nextShortURL";
    public static final String INIT_SHORT_URL = "a";

    public KeyValueRepository(Mongo mongo, Morphia morphia, String dbName) {
        super(mongo, morphia, dbName);
    }
}
