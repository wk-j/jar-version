package wk;

public class Program {
    public static void main(String[] args) {
        String version = A.class.getPackage().getImplementationVersion();
        System.out.println(version);
    }
}

class A {
}