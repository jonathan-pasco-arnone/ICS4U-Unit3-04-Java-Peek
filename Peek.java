/*
* This program uses a custom class.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-012
*/

// Imports.
import java.util.Scanner;

/**
* This is the main outer function.
*/
final class UserError {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private UserError() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {
        // use MrCoxallStack class
        final MrCoxallStack aStack = new MrCoxallStack();
        final String addedNewNumber = "Added ";
        final String popNumber = "Popped ";
        final String newStack = "\nNew Stack: ";
        final String failedPush = "Cannot add to stack, it is not an integer";
        // Create scanner objects for inputs.
        final Scanner myObjOne = new Scanner(System.in);
        final Scanner myObjTwo = new Scanner(System.in);
        final Scanner myObjThree = new Scanner(System.in);
        final int firstNumber;
        final int secondNumber;
        final int thirdNumber;

        System.out.println("Initial stack: ");
        aStack.showStack();

        /*
        * Push
        */
        System.out.println("\n----- Push -------\n");

        try {
            // Adding the first number
            // Ask for inputs
            System.out.println("First Number: ");
            firstNumber = myObjOne.nextInt();

            System.out.println(addedNewNumber + firstNumber);
            aStack.push(firstNumber);
            System.out.println(newStack);
            aStack.showStack();

        } catch (java.util.InputMismatchException ex) {
            System.out.println(failedPush);
        }

        try {
            // Adding the second number
            // Ask for inputs
            System.out.println("\nSecond Number: ");
            secondNumber = myObjTwo.nextInt();

            System.out.println(addedNewNumber + secondNumber);
            aStack.push(secondNumber);
            System.out.println(newStack);
            aStack.showStack();

        } catch (java.util.InputMismatchException ex) {
            System.out.println(failedPush);
        }

        try {
            // Adding the third number
            // Ask for inputs
            System.out.println("\nThird Number: ");
            thirdNumber = myObjThree.nextInt();

            System.out.println(addedNewNumber + thirdNumber);
            aStack.push(thirdNumber);
            System.out.println(newStack);
            aStack.showStack();
        } catch (java.util.InputMismatchException ex) {
            System.out.println(failedPush);
        }

        /*
        * Pops
        */
        System.out.println("\n----- Pop -------\n");

        // Removing the top number
        final int poppedNumber = aStack.pop();
        if (poppedNumber != -1) {
            System.out.println(popNumber + poppedNumber);
            System.out.println(newStack);
            aStack.showStack();
        }
        System.out.println("\nDone.");
    }
}
