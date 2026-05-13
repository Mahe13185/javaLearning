import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student1{
    int id;
    String name;
    int marks;

    Student1(int id,String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
public class Streams {
    static void main() {
        System.out.println("Streams Example");

        List<Integer> li = List.of(67, 2, 3, 3, 3, 3, 35, 8, 9, 12);
        System.out.println(li);

        System.out.println("====");
        li.stream()
                .skip(5)
                .forEach(System.out::println);

        System.out.println("====");
        li.stream()
                .sorted()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .distinct()
                .forEach(System.out::println);

        System.out.println("=====");
        int var = li.stream()
                .reduce(0, Integer::sum);
        System.out.println(var);

        System.out.println("====");
        List<Student1> student = Arrays.asList(
                new Student1(101, "mahendra", 45),
                new Student1(102, "Tharun", 23)
        );

        student.stream()
                .filter(s -> s.marks > 30)
                .forEach(s -> System.out.println(s.name));

//        limit method

        List<String> str = List.of("Mahendra", "Tharun ", "Dell", "Macbook");
        List<String> str2 = str.stream()
                .map(t -> t.toUpperCase())
                .map(t -> t.concat("@gmail.com"))
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(str2);

        int[] arr = {3, 5, 6, 8, 9, 6, 4, 4};

        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);

//        Arrays.stream(arr)
//                .reduce(0, Integer::min)


    }
}
