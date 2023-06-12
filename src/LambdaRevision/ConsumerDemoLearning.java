package LambdaRevision;

import java.util.ArrayList;

public class ConsumerDemoLearning {

    public static void main(String[] args) {

    /*    Consumer cons=(t)->{
            System.out.println(t);
        };
        cons.accept(10);

     */

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.forEach(t-> System.out.println(t));
    }
}
