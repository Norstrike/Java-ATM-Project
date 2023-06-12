import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleFor {
    public static void main(String[] args) {
        List<Integer> list1=List.of(4,6,7,2,9);
        List<Integer> list2=new ArrayList<>();
        for (Integer i:list1) {
            if (i%2==0){
                list2.add(i);
            }
        }
        System.out.println(list2);

        List<Integer> collect = list1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        Collections.sort(collect);
        System.out.println(collect);

        List<Integer> list3=List.of(2,8,6,4);
        Stream<Integer> stream = list3.stream();
        List<Integer> collect1 = stream.map(i -> i * i).filter(i -> i > 10).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
