import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(50);
        list.add(100);

        System.out.println(list);

        System.out.println(list.contains(50));

        list.add(8);
        System.out.println(list);

        list.add(1,0);
        System.out.println(list);

        System.out.println(list.get(1));


    }
}