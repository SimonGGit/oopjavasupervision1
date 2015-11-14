package uk.ac.cam.stjg2.oopjava.supervision1;

public class Question7 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("The length of the list is " + String.valueOf(ll.getLength()));
        System.out.println("The third item is " + String.valueOf(ll.get(3)));
        System.out.println("Deleted the third item.");
        ll.delete(3);
        System.out.println("The length of the list is " + String.valueOf(ll.getLength()));
        System.out.println("The third item is " + String.valueOf(ll.get(3)));
        ll.add(3);
        System.out.println("Added the value '3'");
        System.out.println("The length of the list is " + String.valueOf(ll.getLength()));
        System.out.println("Now adding a reference to the add, so it has a cycle");
        System.out.println("The linked list has a cycle: " + String.valueOf(ll.hasCycle()));
        ll.add(ll.getHead());
        System.out.println("The 11th item is " + String.valueOf(ll.get(13)));
        System.out.println("The linked list has a cycle: " + String.valueOf(ll.hasCycle()));
    }

}
