package collections.specific_property;

import java.util.*;

public class SpecificProperty {
    public <E> int countOfPalindrom(Collection<E> collections){
        int counter = 0;
        for (E item : collections){

        }return counter;
    }
    public <E extends Number> int countOfPrimesIn(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Passed null collection: ");
        }

        int counter = 0;
        for (E item : collection) {
            if (isPrime(item)) {
                counter++;
            }
        }
        return counter;
    }

    public <E extends Number> int countOfOddsIn(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Passed null collection: ");
        }

        int counter = 0;
        for (E item : collection) {
            if (isOdd(item)) {
                counter++;
            }
        }
        return counter;
    }

    private <E> boolean isPalindrome(E obj) {
        String str = obj.toString();

        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }
        if (str.length() == 1) {
            return true;
        }

        int counter = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                counter++;
            }
        }
        return counter == str.length() / 2;
    }

    private <E extends Number> boolean isPrime(E number) {
        if (number.intValue() <= 1) {
            System.out.println("Only >1 numbers can be prime:");
            return false;
        }
        if (number instanceof Double || number instanceof Float) {
            return false;
        }

        for (int i = 2; i <= number.intValue() / 2; i++) {
            if (number.intValue() % i == 0) {
                return false;
            }
        }
        return true;
    }

    private <E extends Number> boolean isOdd(E number) {
        if (number instanceof Double || number instanceof Float) {
            return false;
        }
        return number.doubleValue() % 2 != 0;
    }

    public static void main(String[] args) {
        SpecificProperty counterWithSpecificProperty = new SpecificProperty();

        List<String> strings = new ArrayList<>();
        strings.add("LLLLLLIalil");
        strings.add("Laa");
        strings.add("ALalA");
        strings.add("AL");
        strings.add("LL");

        System.out.println(counterWithSpecificProperty.countOfPalindrom(strings));
    }
}

