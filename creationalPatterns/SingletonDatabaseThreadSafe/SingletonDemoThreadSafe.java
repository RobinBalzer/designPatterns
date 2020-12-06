/**
 * demo class running the database as a singleton and checking whether it is thread-safe by running 2 threads.
 */

public class SingletonDemoThreadSafe {

    public static void main(String[] args){
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        System.out.println("If these values are the same, the singleton was reused (good). Else two singletons were created (bad).");
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            DatabaseThreadSafe database = DatabaseThreadSafe.getInstanceThreadSafe("Foo");
            System.out.println(database.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run(){
            DatabaseThreadSafe database1 = DatabaseThreadSafe.getInstanceThreadSafe("Bar");
            System.out.println(database1.value);
        }
    }
}
