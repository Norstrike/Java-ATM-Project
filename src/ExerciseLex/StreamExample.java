package ExerciseLex;

import java.util.List;
import java.util.OptionalDouble;

class Person{
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<Person> list=List.of(new Person("Rahul",23),
                new Person("Shami",32),new Person("Gill",21));
      //  OptionalDouble average = list.stream().mapToDouble(person -> person.age).average();
       // System.out.println(average);
        OptionalDouble max = list.stream().mapToDouble(person -> person.age).max();
        System.out.println(max);
    }
}
