import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Streams_ass {
    static void main() {
        System.out.println("----Ass1----");
        List<String> employees = List.of("John","Alexandra","Ben","David","Christina","Amy");
        employees.stream()
                .map(x -> x.toUpperCase())
                .filter(x -> x.length()>=5)
                .forEach(System.out::println);

        System.out.println("----Ass2----");
        int[] arr = {3,6,1,8,5,10,7};
        int count = (int) Arrays.stream(arr)
                .filter(x -> x%2!=0)
                .map(x -> x*x)
                .sorted()
                .peek(System.out::println)
                .count();
        System.out.println("Count: " + count);

        System.out.println("----Ass3----");
        String sentence = "Our channel provides Amazing Automation content for Java and Selenuim learners and professionals";

        Arrays.stream(sentence.split("\\s+"))
                .filter(x -> x.toLowerCase().startsWith("a"))
                .map(String::toLowerCase)
                .map(x -> new StringBuilder(x).reverse().toString())
                .sorted()
                .forEach(x -> System.out.println(x + "-" + x.length() + ""));

        System.out.println("----Ass4----");
        String[] fruits = {"Apple","Banana","Avocado","mango","Apricol"};
        Set<String> favoriteFruits = Set.of("Mango","Papaya","Avocado");


    }

}
