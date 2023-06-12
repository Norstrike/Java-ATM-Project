package LambdaRevision;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> sp=()->2*2;
        System.out.println(sp.get());
    }
}
