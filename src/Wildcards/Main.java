package Wildcards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1984);
        integerList.add(1909);
        integerList.add(162);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(6.66);
        doubleList.add(1.23);

        List<Long> longList = new ArrayList<>();
        longList.add(System.currentTimeMillis());
        longList.add(1l);
        longList.add(5l);

        List<List> mainlist = new ArrayList<>();
        mainlist.add(integerList);
        mainlist.add(doubleList);
        mainlist.add(longList);

        for (List list : mainlist) {
            System.out.println(getListInfo(list) + "\n");
        }
    }

    public static String getListInfo(List<? extends Number> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<?> listIterator = list.iterator();

        while (listIterator.hasNext()) {
            sb.append(listIterator.next());
            if (listIterator.hasNext()) {
                sb.append(" - ");
            }
        }
        return sb.toString();
    }
}
