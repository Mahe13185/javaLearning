import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class vectors {
    public static void main() {
        Vector v = new Vector();
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");
        v.add("Mahendra");

        Object[] arr = {2,4,3,2,11,2,34,34};

Vector v1 = new Vector(Arrays.asList(arr));
v1.add(345677);

        System.out.println(v1);
        v1.remove(0);
        v1.isEmpty();
        System.out.println(Arrays.toString(arr));

        System.out.println(v.capacity());
        System.out.println(v.size());

        System.out.println();

        System.out.println(v);

        Vector v2 = new Vector(Arrays.asList(arr));
        System.out.println(v2);
        v2.addAll(v);
        v2.add(0,true);
        System.out.println(v2);
        v2.clear();
        System.out.println(v2);
        System.out.println(v2.capacity());
        System.out.println(v1.capacity());
    }
}