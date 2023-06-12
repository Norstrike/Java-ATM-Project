package LambdaRevision;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemoLearning {
    public static void main(String[] args) {
     /*   Predicate<Integer> p=(t)->t%2==0;
       p.test(5);

      */

      List<Integer> arrayList= Arrays.asList(6,8,5,7,4);
        arrayList.stream().filter(t->t%2==0).forEach(t-> System.out.println(t));



    }
}
