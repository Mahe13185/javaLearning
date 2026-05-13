import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Hashtable {
    static void main() {
        Map<Integer,String> m = new java.util.Hashtable<>();
//        values inserting
        m.put(101,"Mahendra");
        m.put(103,"Tharun");
        m.put(104,"MacBOOK");
        m.put(105,"Lenovo");
        m.put(107,"Dell");

        Set<Integer> keys = m.keySet();
        for (Integer key : keys){
            System.out.println(key + " --- " + m.get(key));
        }
//        Removing values from the HashTable
        m.remove(103);

        Collection<String> values = m.values();
        for (String value : values){
            System.out.println(value);
        }
        m.containsKey(104);
        m.containsKey(3232);

        m.containsKey("Mahendra");
        m.containsKey("Dell G15");



    }
}
