package datastructs.lists;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkeyLists {
    
    public LinkedList<String> myLinkedList2;
    public Scanner scan;

    public LinkeyLists() {
        this.scan = new Scanner(System.in);
        this.myLinkedList2 = new LinkedList<String>();
    }

    public void displayLinkedList() {
        System.out.println(myLinkedList2);
    }

    public void populateLinkedList() {
        System.out.println("Make a linked list with 5 elements");
        myLinkedList2.add("A"); 
        myLinkedList2.add("B"); 
        myLinkedList2.addLast("C"); 
        myLinkedList2.addFirst("D"); 
        myLinkedList2.add(2, "E"); //adds E at index 2

        System.out.println("Original linked list:");
        System.out.println(myLinkedList2); 
    }

    public void setElementByIndex() {
        myLinkedList2.set(0, "Z"); //sets the element at index 0 to Z
        System.out.println("Linked list after set method:");
        System.out.println(myLinkedList2);
    }

    public void removeFromLinkedList() {
        myLinkedList2.remove("B"); //this removes an element by name
        myLinkedList2.remove(3); //this will remove an element at the 3rd index 
        myLinkedList2.removeFirst(); 
        myLinkedList2.removeLast();

        System.out.println("Linked list after remove methods:");
        System.out.println(myLinkedList2);
    }

    public static void linkedListToArray() {
        LinkedList<Integer> list= new LinkedList<Integer>(); 
        list.add(123); 
        list.add(12); 
        list.add(11); 
        list.add(1134); 
        System.out.println("LinkedList: "+ list); 
        Object[] a = list.toArray(); 
        System.out.print("After converted LinkedList to Array: "); 
        for(Object element : a) 
        System.out.print(element+" ");
        System.out.println();
    }

    public static void pollMethod() {
        /*poll comes in 3
         * -list.poll() by defaults retrieves and remove first element of a linked list
         * just like list.pollFirst(), these two are opposite of list.pollLast()
         */

        LinkedList<Integer> list= new LinkedList<Integer>(); 
        list.add(123); 
        list.add(12); 
        list.add(11); 
        list.add(1134);

        list.poll();
        System.out.println("LinkedList after poll(): " + list);
        list.pollFirst();
        System.out.println("LinkedList after pollFirst(): " + list);
        list.pollLast();
        System.out.println("LinkedList after pollLast(): " + list);
    }

    public static void peekMethod() {
        /*peek is different from poll in that peek retrieves only but not remove an element */
        LinkedList<Integer> list= new LinkedList<Integer>(); 
        list.add(123); 
        list.add(12); 
        list.add(11); 
        list.add(1134);

        System.out.println("peek() results: " + list.peek());
        System.out.println("peekFirst() results: " + list.peekFirst());
        System.out.println("peekLast() results: " + list.peekLast());
    }

    public static void main(String[] args) {
        LinkeyLists link = new LinkeyLists();
        link.populateLinkedList();
        link.removeFromLinkedList();
        link.setElementByIndex();
        linkedListToArray();
        pollMethod();
        peekMethod();
    }
}
