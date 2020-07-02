package static_block_variables_methods;

class StaticClass {
    static float PI = 3.16f;

    static void display() {
        System.out.println("PI: " + PI);
    }

    static {
        System.out.println("Static Block in StaticClass"); // this will executed 4th
    }
}