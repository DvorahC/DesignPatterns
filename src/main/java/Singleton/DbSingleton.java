package Singleton;

/**
 * SINGLETON - creational pattern
 * only one instance is created
 * lazily loaded
 * static in nature but not using a static class
 * private instance + private constructor cause we want the singleton itself to call
 * the constructor ! and nobody else!
 * No parameters into the constructor ( factory pattern which violates rules of singleton)
 *
 * Lazy Loaded:
 * Lazy loading is a design pattern commonly used to defer initialization of an object until the point at which it is needed.
 * It can contribute to efficiency in the program's operation if properly and appropriately used.
 *
 */

public class DbSingleton {

    private DbSingleton(){
    }

    //use lazy Loaded with the null in order to optimize the speed
    private static DbSingleton instance = null;
    //private static DbSingleton instance = new DbSingleton();

    public static DbSingleton getInstance(){
        if(instance == null){
            instance = new DbSingleton();
        }
        return instance;
    }
}
