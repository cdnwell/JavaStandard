import java.util.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        List checkedList = checkedList(list, String.class);
        checkedList.add("abc");
//        checkedList.add(9);
        System.out.println(list);

        List list2 = new ArrayList();
        addAll(list2, 1,2,3,4,5);
        System.out.println(list2);

        rotate(list2, 2);
        System.out.println(list2);

        swap(list2, 0, 2);
        System.out.println(list2);

        shuffle(list2);
        System.out.println(list2);

        sort(list2, reverseOrder());
        System.out.println(list2);

        sort(list2);
        System.out.println(list2);

        int idx = binarySearch(list2, 3);
        System.out.println("index of 3 : " + idx);

        System.out.println("max : " + max(list2));
        System.out.println("min : " + min(list2));
        System.out.println("min : " + max(list2, reverseOrder()));

        fill(list2, 9);
        System.out.println(list2);

        List newList = nCopies(list2.size(), 2);
        System.out.println("newList=" + newList);

        System.out.println(disjoint(list, newList));

        copy(list2, newList);
        System.out.println("newList=" + newList);
        System.out.println("list=" + list2);

        replaceAll(list2, 2, 1);
        System.out.println("list=" + list2);

        Enumeration e = enumeration(list2);
        ArrayList list3 = list(e);

        System.out.println("list3=" + list3);
    }
}