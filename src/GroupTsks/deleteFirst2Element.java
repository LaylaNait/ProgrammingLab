package GroupTsks;

import java.util.ArrayList;
import java.util.Arrays;

public class deleteFirst2Element {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Appel","Orange","Kiwi"));
        list.remove(0);
        System.out.println(list);
        list.remove(0);
        System.out.println(0);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Appel","Orange","Kiwi"));
        String firstElement = list2.get(0);
        String lastElement = list2.get(1);
        list2.remove(firstElement);
        list2.remove(lastElement);
        System.out.println(list2);

    }
}
