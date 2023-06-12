package ExerciseLex;

import java.util.Optional;

public class LearningOptional {

    public static Optional<String> get(){
        String name="Saurabh";
        return Optional.ofNullable(name);
    }
    public static void main(String[] args) {
     /*   String str=null;
        if (str==null){
            System.out.println("This is null");
        }else{
            System.out.println("good job");
        }
      */
        String str1=null;
        String str="Java is best";
        Optional<String> optional = Optional.ofNullable(str1);
        System.out.println(optional.isPresent());
      //  System.out.println(optional.get());
        System.out.println(optional.orElse("No value is present"));
        System.out.println(get());
    }
}
