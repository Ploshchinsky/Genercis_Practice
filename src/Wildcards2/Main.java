package Wildcards2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("First", 1);
        Pair<String, Integer> pair2 = new Pair<>("Second", 2);
        Pair<String, Integer> pair3 = new Pair<>("Third", 3);

        pair2.setValue(22);
        String pair3key = pair3.getKey();
        pair1.setKey(pair3key + pair1.getKey());

        List<Pair<String, Integer>> pairList = List.of(pair1, pair2, pair3);
        pairList.forEach(System.out::println);
        System.out.println("-----");
        Pair<Long, Long> longPair = new Pair<>(500l, 533l);
        System.out.println("Pair.getSumFromPair (" + longPair + ") = " + Pair.getSumFromPair(longPair));
    }
}
