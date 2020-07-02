package static_block_variables_methods;

 class Main {
    static {
        System.out.println("Static Block 1 in MainClass(Same class)"); // this will executed 1st
    }
    static {
        System.out.println("Static Block 2 in MainClass(Same class)"); // this will executed 2nd
    }
    static {
        System.out.println("Static Block 3 in MainClass(Same class)"); // this will executed 3rd
    }
    public static void main(String[] args) {
         System.out.println("PI(From main function): "+StaticClass.PI);
         StaticClass.display();
    }
}