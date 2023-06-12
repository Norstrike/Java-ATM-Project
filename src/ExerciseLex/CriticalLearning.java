package ExerciseLex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CriticalLearning {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Ross","Rhan","Mona","Rary");
     //   Comparator<String> criteria=(str1,str2)->str1.compareTo(str2);
     //   list.sort((str1,str2)->str1.length()-str2.length());
      //  list.sort((str1,str2)->str1.charAt(0)-str2.charAt(0));
      //  System.out.println(list);
        Stream<String> stream = list.stream();
        stream.sorted(Comparator.comparing(value->value.length()==4)).forEach(System.out::println);
    }
}
