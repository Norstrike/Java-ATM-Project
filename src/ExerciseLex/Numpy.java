package ExerciseLex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numpy {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("John","Jack","Jill","Jim","Garry","Frank");
        List<String> collect = lst.stream().filter(value -> value.startsWith("J") && value.length() == 4).collect(Collectors.toList());
        System.out.println(collect);
    }

}
