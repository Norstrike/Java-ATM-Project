package ExerciseLex;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewExercise {
    public static void main(String[] args) {
       List<String> str= Arrays.asList("Ron","Miller","Hardik","Gill");
        Stream<String> stream = str.stream();
     //   Map<String, Integer> collect = stream.collect(Collectors.toMap(x -> x, x -> x.length()));
    //    System.out.println(collect);
        OptionalInt max = stream.mapToInt(value -> value.length()).max();

        if (max.isPresent()) {
            int maxLength = max.getAsInt();
            System.out.println("Maximum Length: " + maxLength);
        } else {
            System.out.println("No strings in the list.");
        }


    /*  List<Integer> list=List.of(2,4,6,8);
        int sum = list.stream().mapToInt(x -> x).sum();
        System.out.println(sum);

        List<String> str=List.of("Rahul","Mehul","Sachin","Atul");
        List<String> collect = str.stream().filter(value -> value.startsWith("A")).collect(Collectors.toList());
        System.out.println(collect);

     */





    }
}
