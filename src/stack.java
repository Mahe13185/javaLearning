import java.util.Stack;

public class stack {
    static void main() {
        Stack<String> s = new Stack<>();
        System.out.println(s.isEmpty());
        s.push("Mahendra");
        s.push("Tharun");
        s.push("Linganna");
        s.push("Sharma");
        System.out.println(s);

        System.out.println(s.search("Mahendra"));
        s.pop();
        s.pop();

        s.pop();
        s.push("mahendra");
        s.push("Mahendra");

        System.out.println();
        System.out.println(s);
        System.out.println(s.empty());
    }

}
