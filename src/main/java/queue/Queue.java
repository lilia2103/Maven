package queue;

import java.util.Deque;
import java.util.*;

public class Queue {
    public  void addElementQ(){
        java.util.Queue obj = new LinkedList();
        obj.add(1);
        obj.add(4);
        obj.add(30);
    }

    public void addElementD(){
        Deque obj = new LinkedList();
        obj.add(1);
        obj.add(4);
        obj.add(30);
    }

    public void queOfInteg(){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(1);
        queue.add(4);
        queue.add(30);

        while (!queue.isEmpty()){
            queue.poll();
            System.out.println(queue);
        }
    }

    public void dequeOfIntegers(){
        Deque deque = new ArrayDeque();
        deque.add(1);
        deque.add(4);
        deque.add(30);

        while (!deque.isEmpty()){
            deque.poll();
        }
    }

    public void queOfStrings(){
        PriorityQueue<String> queue = new PriorityQueue<String>();
        Scanner sc = new Scanner(System.in);
        queue.add("Lilia");
        queue.add("Aram");
        queue.add("Gayane");
    }

    public void checkQueue(String name){
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Lilia");
        queue.add("Aram");
        queue.add("Gayane");
        if (queue.contains(name)){
            System.out.println("\n" + name + "is present in the Queue ");
        } else {
            System.out.println("\n" + name + " is not");
        }
    }

    public void checkDeque(String name){
        Deque<String> deque = new ArrayDeque();
        deque.add("Lilia");
        deque.add("Aram");
        deque.add("Harut");
        if (deque.contains(name)){
            System.out.println("\n" + name + "i preent in the Queue ");
        }else {
            System.out.println("\n" + name + "is not ");
        }
    }
    public void queueOfColors() {
        PriorityQueue<String> colors = new PriorityQueue<>();

        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        while (!colors.isEmpty()) {
            System.out.println(colors.poll());
        }
    }
    public void copyOfQueue() {
        PriorityQueue queue = new PriorityQueue();

        queue.add(1);
        queue.add(4);
        queue.add(30);


        PriorityQueue priorityQueue = new PriorityQueue(queue);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }

    public void removeFirstElement() {
        PriorityQueue queue = new PriorityQueue<>();

        queue.add("տանձ");
        queue.add("խնձոր");
        queue.add("մանդարին");

        System.out.println("\nList: " + queue);
        queue.poll();
        System.out.println("\nList after remove first element: " + queue);
    }

    public void printAllNumbers() {
        java.util.Queue<Integer> queue = new LinkedList<>();
        int counter = 0;
        for (int i = 1; i < 200; i += 2) {
            queue.add(i);
        }
        System.out.print("The first 50 members of the list:  [  ");
        while (counter < 50) {
            System.out.print(queue.poll() + "  ");
            counter++;
        }
        System.out.println("]");

    }

}
