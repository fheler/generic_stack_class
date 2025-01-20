package fheler;

/**
 * A generic Stack class that uses an array to store elements.
 * Implements the Last-In-First-Out (LIFO) principle.
 *
 * @param <T> the type of elements stored in the stack
 * @author Fabian Heler
 * @version 2025-01-20
 */
public class GenericStack<T> {
    private Object[] elements;
    private int top;
    private int capacity;

    /**
     * Default constructor that initializes the stack with a default capacity of 10.
     */
    public GenericStack() {
        this.capacity = 10;
        this.elements = new Object[capacity];
        this.top = -1;
    }

    /**
     * Constructor that initializes the stack with a specified capacity.
     *
     * @param capacity the maximum number of elements the stack can hold
     */
    public GenericStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.top = -1;
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param element the element to be added to the stack
     * @throws StackFullException if the stack is full
     */
    public void push(T element) throws StackFullException {
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full");
        }
        elements[++top] = element;
    }

    /**
     * Removes and returns the top element from the stack.
     *
     * @return the top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[top--];
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return the top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[top];
    }

    /**
     * Returns a string representation of all elements in the stack, separated by ';'.
     *
     * @return a string of all stack elements
     */
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]);
            if (i < top) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
