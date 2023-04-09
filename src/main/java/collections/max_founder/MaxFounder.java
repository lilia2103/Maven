package collections.max_founder;

import abstract_class_and_interface.home3.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxFounder {
    public static <T> T maxof(List<T> list) {
        List<T> sort =  new ArrayList<>(list);
        sort.sort(Collections.reverseOrder());

        return sort.get(0);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(7);
        integers.add(12);
        integers.add(0);

        System.out.println(MaxFounder.maxof(integers));
        System.out.println(integers);
    }
}
