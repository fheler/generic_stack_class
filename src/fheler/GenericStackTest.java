package fheler;

/**
 * Test class for the GenericStack class.
 * @author Fabian Heler
 * @version 2025-01-20
 */
public class GenericStackTest {
    public static void main(String[] args) {
        try {
            // Test with a stack of integers
            GenericStack<Integer> numberStack = new GenericStack<>(5);
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            System.out.println("Number stack list: " + numberStack.list()); // Expected: 10;20;30
            System.out.println("Peek: " + numberStack.peek()); // Expected: 30
            System.out.println("Pop: " + numberStack.pop()); // Expected: 30
            System.out.println("Number stack after pop: " + numberStack.list()); // Expected: 10;20

            // Test with a stack of strings
            GenericStack<String> textStack = new GenericStack<>(3);
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("Text stack list: " + textStack.list()); // Expected: Hello;World
            System.out.println("Peek: " + textStack.peek()); // Expected: World
            System.out.println("Pop: " + textStack.pop()); // Expected: World
            System.out.println("Text stack after pop: " + textStack.list()); // Expected: Hello

            // Test stack full exception
            textStack.push("Java");
            textStack.push("Stack");
            textStack.push("Overflow"); // Should throw StackFullException
        } catch (StackFullException | StackEmptyException e) {
            System.err.println(e.getMessage());
        }
    }
}

