/*
* This is the Main function.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-013
*/

import java.util.ArrayList;

/**
* This is the class that contains many functions.
*/
public final class MrCoxallStack {
    /**
    * Create the stack as an ArrayList.
    */
    private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

    /**
    * Peeks at the top value.
    *
    * @return returns the top value of the stack
    */
    public int peek() {
        final int returnValue;
        if (stackAsArray.size() > 0) {
            final int peekNumber = stackAsArray.get(0);
            returnValue = peekNumber;
        } else {
            System.out.println("Stack is empty, cannot peek");
            returnValue = -1;
        }
        return returnValue;
    }

    /**
    * Adds a number to the ArrayList.
    *
    * @param pushNumber this is the inputted number to be added
    */
    public void push(final Integer pushNumber) {
        stackAsArray.add(0, pushNumber);
    }

    /**
    * Pops the top number off of the ArrayList.
    *
    * @return returns wheather or not the "pop" was successful
    */
    public int pop() {
        final int returnValue;
        if (stackAsArray.size() > 0) {
            final int poppedNumber = stackAsArray.get(0);
            stackAsArray.remove(0);
            returnValue = poppedNumber;
        } else {
            System.out.println("Stack is empty, cannot pop");
            returnValue = -1;
        }
        return returnValue;
    }

    /**
    * Prints the ArrayList.
    */
    public void showStack() {
        System.out.println(stackAsArray);
    }
}
