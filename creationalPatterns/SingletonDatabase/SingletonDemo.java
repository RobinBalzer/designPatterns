/**
 * demo class for singleton. Simply call getInstance twice.
 * On first call,  the singleton object (database) should be created.
 * On second call, we should not (!) get another object...
 */

public class SingletonDemo {

    public static void main(String[] args){
        Database database = Database.getInstance("Foo");
        Database database1 = Database.getInstance("Bar");
        String result = "";
        result += "value database: " + database.value + ", value database1: " + database1.value + "\n";
        result += "If these values are the same, the singleton was reused (good). Else two singletons were created (bad).";

        System.out.println(result);
    }

}
