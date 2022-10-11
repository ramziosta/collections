package org.example;

import java.time.LocalDate;
import java.util.*;

import java.util.PriorityQueue;

/**
 * 
 * AlchemyPriorityQueue is a demonstration project that provides a presentation
 * of methods for PriorityQueue class.
 * *
 * Priority Queue = A FIFO data structure serves elements with the highest
 * priorities first
 * PriorityQueue implements the Queue Interface, Collection Interface, Iterable
 * Interface,
 * inherits form abstract classes AbstractQueue, AbstractCollection, Collection,
 * Object.
 * 
 * It inserts items in order, and removes them by Max value
 * if we need to reverse the order of iteration we use
 * Collection.reverseOrder();
 * _ Does not permit null
 * Objects are comparable. All ints, doubles, strings, etc
 * They are unbounded. We can resize the Q
 * Head of the Q is the least element. Competing elements, one will win
 * ** not thread safe( there is a PriorityBlockingQueues class that implements )
 * Methods: poll, remove, peak, remove.... please check the documentations for
 * more interesting methods!
 */

public class Main {

    public static void main(String args[]) {

        // < queues are interfaces, we cannot implement them directly therefore we need to
        // < utilize a class that implements the Queue as LinkedList or PriorityQueue

        // < Linked list implements the Queue interface. this is a demo of how a linked
        // < list works:


        //<RAMZI
        Queue<Double> LinkedListTickets = new LinkedList<>();

        // > offer comes from the queue collection: both insert elements into the Queue

        LinkedListTickets.offer(33.0);
        LinkedListTickets.offer(155.70);
        LinkedListTickets.offer(49.0);
        LinkedListTickets.offer(23.54);
        LinkedListTickets.offer(88.0);
        LinkedListTickets.offer(33.0);
        LinkedListTickets.offer(155.70);

        System.out.println("");
        System.out.println("Linked List");
        System.out.println("");
      

        while (!LinkedListTickets.isEmpty()) {

            System.out.println("LinkedList Tickets: " + LinkedListTickets.poll());

        }

        System.out.println("");
        System.out.println("");

        // > Regular PriorityQueue
        PriorityQueue<Double> tickets = new PriorityQueue<>();

        tickets.offer(33.0);
        tickets.offer(155.70);
        tickets.offer(49.0);
        tickets.offer(23.54);
        tickets.offer(88.0);

        System.out.println("PriorityQueue");
        System.out.println("");
        while (!tickets.isEmpty()) {

            System.out.println("PriorityQueue Tickets: " + tickets.poll());

        }
        System.out.println("");
        System.out.println("");

      
//< Alvin ADD AND OFFER
        // > we can use a default comparator from Collection interface: reverseOrder();
        // >returned in reverse order because we used the Collections.reverse interface:

        PriorityQueue<Double> reversedTickets = new PriorityQueue<>(Collections.reverseOrder());

        reversedTickets.offer(33.0);
        reversedTickets.offer(155.70);
        reversedTickets.offer(49.0);
        reversedTickets.offer(23.54);
        reversedTickets.offer(88.0);

        System.out.println("");
        System.out.println("");
        System.out.println("Reversed Tickets");
        System.out.println("");
//< Greg returns true or false for .contains();
        System.out.println("Does it contain 23.54? " + reversedTickets.contains(23.55));

        while (!reversedTickets.isEmpty()) {
//<Alfred
            System.out.println("PriorityQueue Reversed Tickets: " + reversedTickets.poll());
            System.out.println("the next head is: " + reversedTickets.peek());

        }
        System.out.println("");
        System.out.println("");

     
        // > Strings returned in reverse order because we used the Collections.reverse
        // > interface
        PriorityQueue<String> names = new PriorityQueue<>(Collections.reverseOrder());

        names.offer("Billy");
        names.offer("Cameron");
        names.offer("Alex");
        names.offer("Fido");
        names.offer("sandy");
        names.offer("danny");
        names.offer("Danny");

        System.out.println("");
        System.out.println("Strings");
        System.out.println("");
   
        // > returns a boolean true or false
        System.out.println("is Fido removed? " + names.remove("Fido"));

        while (!names.isEmpty()) {
            System.out.println("Names: " + names.poll());

        }
        System.out.println("");
        System.out.println("");

        // > Objects in the PriorityQueue compare object ids

        
        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Employee(1l, "Vickey", LocalDate.now()));
        priorityQueue.add(new Employee(4l, "Alfred", LocalDate.now()));
        priorityQueue.add(new Employee(5l, "Alvin", LocalDate.now()));
        priorityQueue.add(new Employee(2l, "Greg", LocalDate.now()));
        priorityQueue.add(new Employee(3l, "Christopher", LocalDate.now()));
        priorityQueue.add(new Employee(6l, "Ramzi", LocalDate.now()));

        System.out.println("");
        System.out.println("Objects");
        System.out.println("");
       
        while (true) {
            Employee e = priorityQueue.poll();
            System.out.println(e);

            if (e == null)
                break;
        }
    }

}