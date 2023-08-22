public class Main {

    static int a = 5, b = 6;

    public static void main(String[] args) {
        System.out.printf("Before swapping: a = %d, b = %d \n", a, b);
        swap();
        System.out.printf("After swapping: a = %d, b = %d", a, b);
    }

    public static void swap() {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}
