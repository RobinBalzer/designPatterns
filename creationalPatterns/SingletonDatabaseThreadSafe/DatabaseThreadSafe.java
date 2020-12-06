/**
 * we now make the database thread-safe by using double-checked locking and the synchronized keyword.
 */

public final class DatabaseThreadSafe {

    /**
     * use volatile to read/write directly to main memory and not cache it.
     */
    private static volatile DatabaseThreadSafe instance;
    public String value;

    private DatabaseThreadSafe(String value) {
        this.value = value;
    }

    /**
     * Use double-checked locking (DCL).
     *
     * @param value
     * @return
     */

    public static DatabaseThreadSafe getInstanceThreadSafe(String value) {

        DatabaseThreadSafe result = instance;
        if (result != null) {
            return result;
        }
        /**
         * use synchronized for limiting the amount of threads active in this block to one. (MUTEX-like)
         */

        synchronized (DatabaseThreadSafe.class) {
            if (instance == null) {
                instance = new DatabaseThreadSafe(value);
            }
            return instance;
        }

    }
}
