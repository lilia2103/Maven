package collections.set_map;
import abstract_class_and_interface.home3.A;
import inheritance.aggregation.aggregation1.Person;

import java.util.*;


public class SetMap {

    //hashSet ex
    /**
     * ex1.method find common elements usong HashSet
     */
    public  int FindElements(){
        int counter = 0;
        HashSet<Integer> hs =new HashSet<>(List.of( 1, 2, 3, 4, 5, 6));
        HashSet<Integer> Hs = new HashSet<>(List.of(4, 6 ,7, 8,10));

        for ( Integer integer : hs) {
            for (Integer int1: Hs){
                if (integer.equals(int1)){
                    counter++;
                }
            }
        }
        return counter;
    }

    /**
     *  ex.2  sort in ascending order Using HashSet
     * @param hashSet
     */
    public void OrderByAge(HashSet<Person> hashSet){
        hashSet.add(new Person("Lilia", 19));
        hashSet.add(new Person("Aram" , 22));
        hashSet.add(new Person("Gayane", 27));

        ArrayList arrayList =  new ArrayList(hashSet);

        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }


    /**
     * ex.3 dont add unique word
     * @return
     */
    public HashSet Ignore(){
        HashSet<String> hashSet =  new HashSet<>();
        hashSet.add("World");
        hashSet.add("unique");
        hashSet.add("List");

        HashSet<String> uniqHash = new HashSet<>();
        for (String str : hashSet) {
            String lowerSr =  str.toLowerCase();
            if ( !uniqHash.contains(lowerSr)){
                uniqHash.add(lowerSr);
            }
        }
        System.out.println("origin Set " + hashSet);
        System.out.println("Unique Set " + uniqHash);
        return  uniqHash;
    }

    //LinkedHashSet

    /**
     * ex.1 remove even number
     */
    public void removeElements(){
        LinkedHashSet<Integer> ha = new LinkedHashSet<>();
        ha.add(7);
        ha.add(3);
        ha.add(-9);
        ha.add(-74);
        ha.add(1);
        ha.add(25);

        LinkedHashSet linkedHashSet = new LinkedHashSet<>();

        System.out.println("list element " + ha );

        for (Integer i : ha) {
            if (i % 2 != 0){
                linkedHashSet.add(i);

            }
        }
        System.out.println("new list whithout remove elemets " + linkedHashSet);
    }

    /**
     * soring by ascending order of age
     * @param linkedHashSet
     */
    public void OrderByNameAge(LinkedHashSet<Person> linkedHashSet) {
        linkedHashSet.add(new Person("Lilia", 19));
        linkedHashSet.add(new Person("Aram", 22));
        linkedHashSet.add(new Person("Gayane", 27));

        ArrayList<Person> a = new ArrayList<>(linkedHashSet);
        for (Object o : a) {
            System.out.println(o + "  ");
        }
    }

    /**
     * remove duplicat name
     */
    public void reDublicatName(){
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Person("Lilia", 19));
        linkedHashSet.add(new Person("Aram", 22));
        linkedHashSet.add(new Person("Gayane", 27));

        LinkedHashSet<String> name= new LinkedHashSet<>();
        LinkedHashSet<Person>  uniq = new LinkedHashSet<>();
        for(Person person : linkedHashSet){
            if (!name.contains(person.getName()));{
                uniq.add(person);
                name.add(person.getName());
            }
        }
        System.out.println(" origin Set ");
        for (Person p : linkedHashSet) {
            System.out.println("  " + p);
        }

        System.out.println("Uniw Set ");
        for (Person p: uniq) {
            System.out.println("  " + p);
        }
    }

    //TrreSet

    /**
     *  order by Name age
     * @param treeSet
     */
    public void orderByNameAge(TreeSet<Person> treeSet){

        treeSet.add(new Person("Lilia", 19));
        treeSet.add(new Person("Aram", 22));
        treeSet.add(new Person("Gayane", 27));
        ArrayList<Person> a = new ArrayList<>(treeSet);
        for (Object o: a){
            System.out.println(o + " ");
        }
    }


    /**
     * don`t add uniq world
     */
    public void containsFirstlist(){
        TreeSet<Integer> treeSet =  new TreeSet<>(List.of(1, 4, 5, 7,0 ,-1));
        TreeSet<Integer> treeSet1 = new TreeSet<>(List.of(4,7,10,-7,4));

        TreeSet<Integer> uniqSet =  new TreeSet<>();

        System.out.println("Origin list 1  " + treeSet);
        System.out.println("origin list 2 " + treeSet1);

        for (Integer i : treeSet){
            Integer j = i;
            if (!treeSet1.contains(j)){
                uniqSet.add(j);
            }
        }
        System.out.println("Uniq set " + uniqSet);
    }

    /**
     * don`t add uniq word
     */
    public void ignoreCas(){
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("java");
        treeSet.add("Payton");
        treeSet.add("Sql");
        treeSet.add("mi hat el java" );
        System.out.println("origi lit " + treeSet);
        TreeSet<String> uniqTReeSet =  new TreeSet<>();
        for (String c : treeSet){
            String j = c.toLowerCase();
            if (treeSet.contains(j)){
                uniqTReeSet.add(j);
            }
        }
        System.out.println("uniq list " + uniqTReeSet);
    }

    //hash map

    /**
     * anagram paint
     * @return
     */
    public int anagramPairs(){
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(0,"lav");
        hashMap.put(1, "che");
        hashMap.put(2,"de");
        hashMap.put(3, "lav");

        int tmp = 0;
        int tmp1 = 0;
        int counter = 0;
        for (int i = 0; i < hashMap.size() - 1; i++) {
            for (int k = 0; k < hashMap.get(i).length(); k++) {
                tmp += hashMap.get(i).charAt(k);
            }
            for (int j = 0; j < hashMap.size(); j++) {
                for (int k = 0; j < hashMap.get(j).length(); k++) {
                    tmp1 += hashMap.get(j).charAt(j);
                }
                if(tmp == tmp1){
                    counter++;
                }
                tmp1 = 0;
            }
            tmp = 0;
        }
        return  counter * 2;
    }





}
