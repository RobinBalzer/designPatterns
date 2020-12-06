/**
 * Singleton class. Only one object of the database should exist.
 * --> we make the constructor private and define a getInstance method that calls the database or creates it, if it's the first call.
 */

public final class Database {
    private static Database instance;
    public String value;

    private Database(String value){
        this.value = value;
    }

    public static Database getInstance(String value){
        if (instance == null) {
            instance = new Database(value);
        }

        return instance;
    }

}
