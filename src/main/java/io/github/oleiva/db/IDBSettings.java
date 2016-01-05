package io.github.oleiva.db;

/**
 * DB settings.
 */

public interface IDBSettings {
    String DB_URL = "localhost";
    int DB_PORT = 27017;
    String ID_FIELD_NAME = "_id";
    String DB_NAME = "links";
    String DB_LOGIN = "links_user";
    char[] DB_PASSWORD = {'t'};
}
