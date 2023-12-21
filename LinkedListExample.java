import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> nameLinkedList = new LinkedList<>();
        nameLinkedList.add("Eve");
        nameLinkedList.add("Frank");
        nameLinkedList.add("Grace");
        nameLinkedList.add("Harry");

        System.out.println("Traversal using 'for loop':");
        for (String name : nameLinkedList) {
            System.out.println(name);
        }

        nameLinkedList.removeFirst();
        nameLinkedList.removeLast();

        System.out.println("\nModified list using 'advanced for loop':");
        for (String name : nameLinkedList) {
            System.out.println(name);
        }

        nameLinkedList.addFirst("Ivy");
        nameLinkedList.addLast("Jack");

        System.out.println("\nFinal list using iterator:");
        Iterator<String> iterator = nameLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
