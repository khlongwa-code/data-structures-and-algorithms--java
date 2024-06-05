package datastructs.stacks;

import java.util.Stack;

public class MyStack {
    /*Last-in-First-Out (LIFO)*/
    private Stack<Integer> stack;

    public MyStack() {
        this.stack = new Stack<Integer>();
    }

    public void populateStack() {
        /*Push method pushes elements onto the stack */
        stack.push(10);  
        stack.push(20);  
        stack.push(30); 
    }

    public void showStackDetails() {
        /*Shows all about a stack */
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());
    }

    public int getPoppedElement() {
        /*Popped element is expected to be 30 considering LIFO */
        return stack.pop();
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.populateStack();
        stack.showStackDetails();
        int poppedElement = stack.getPoppedElement();
        System.out.println("Popped element: " + poppedElement);
    }
}
