import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(43);
        list.add(-12);
        list.add(21);
        list.add(90);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        System.out.println();

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(23);
        list1.add(43);
        list1.add(-12);
        list1.add(21);
        list1.add(90);
        System.out.println(list1);
        Collections.shuffle(list1);
        System.out.println(list1);
    }
}
