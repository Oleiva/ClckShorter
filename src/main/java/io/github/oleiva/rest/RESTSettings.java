package io.github.oleiva.rest;

public final class RESTSettings {

//    private static final String NET_REST_URL = "http://link-in-ua.j.rsnx.ru";
    private static final String NET_REST_URL = "http://localhost:8080";
    private static final String LOCAL_REST_URL = "http://localhost:8080";
    private static boolean isLocaleMode = false;

    public static String getRestUrl() {
        return isLocaleMode ? LOCAL_REST_URL : NET_REST_URL;
    }

    public static void setLocaleMode(boolean localeMode) {
        isLocaleMode = localeMode;
    }

}
