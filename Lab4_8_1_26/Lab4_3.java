class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show() method");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}

public class Lab4_3{
    public static void main(String[] args) {

        Apple ref;   // Base class reference

        ref = new Apple();
        ref.show();

        ref = new Banana();
        ref.show();

        ref = new Cherry();
        ref.show();
    }
}
