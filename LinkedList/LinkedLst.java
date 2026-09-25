import java.util.LinkedList;

public class LinkedLst {
    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        // Add elements
        students.add("Rahul");
        students.add("Anu");
        students.add("Kiran");

        System.out.println("Original List: " + students);

        students.addFirst("Hemanth");
        students.addLast("Ravi");

        System.out.println("After adding: " + students);

        students.add(2, "Priya");
        System.out.println("After adding at index 2: " + students);

        
        System.out.println("First student: " + students.getFirst());
        System.out.println("Last student: " + students.getLast());

        System.out.println("Student at index 2: " + students.get(2));

        
        students.set(2, "Sita");
        System.out.println("After changing: " + students);

        
        students.removeFirst();
        students.removeLast();

        System.out.println("After removing first and last: " + students);

        students.remove(1);
        System.out.println("After removing index 1: " + students);

        System.out.println("Contains Anu: " + students.contains("Anu"));

        
        System.out.println("Size: " + students.size());

        System.out.println("Students:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}