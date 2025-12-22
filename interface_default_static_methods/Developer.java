package interface_default_static_methods;

public interface Developer {

    static public void notOverride() {
        System.out.println("child class cannot override it, and it can be directly call through interface name");
    }

    default void init() {
        System.out.println("This is default method for all developers");
    }
    void develop();
    // void test();
}
