package interface_default_static_methods;

public class Main {
    public static void main(String[] args) {
        Developer androiDeveloper = new AndroidDeveloper();
        Developer iosDeveloper = new IosDeveloper();
        androiDeveloper.develop();
        iosDeveloper.develop();
        androiDeveloper.init();
        iosDeveloper.init();
        Developer.notOverride();
    }
}
