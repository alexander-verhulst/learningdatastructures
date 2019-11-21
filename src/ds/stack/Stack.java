package ds.stack;

//This is a stack data structure

public class Stack {

    private int maxSize; //How big our container is
    private char [] stackArray; //Trying to reverse string. Change 1.
   // private long[] stackArray;  //Container that stores the list of items
    private int top; //index position of last item placed on stack

    //Create a constructor to initilize data structure
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize]; //Change 2. Changed from long to char
        this.top = -1; //will be at 0 index of array. Arrays start at 0 index
    }

    //Create methods to support push and pop operations

    //change 3. Changed long to char j
    public void push (char j) { //Doesn't return anything, just pushes on top of stack. Accepts value of type long

        if (isFull()) {
            System.out.println("This stack is already full"); //THIS ESTABLISHES SIZES ON STACKS
        } else {
            top++;
            stackArray[top] = j;
        }

        /*top++; //Top is incremented since new item is placed on top
        stackArray[top] = j; //Top position is what value was placed on top */
    }

    //change 4. changed long to char
    public char pop() { //Returns item that was popped

        if (isEmpty()) {
            System.out.println("The stack is already empty"); //This is for if your stack has a limit
            return '0'; //change 5. changed -1 to zero
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
        /*  CODE FOR WHEN YOUR STACK DOESNT HAVE A LIMIT
        int old_top = top; //Make copy of current top index
        top--; //reduce index number because we removed that item from the stack
        return stackArray[old_top]; // */
    }

    //Method for peak. Returns item that is currently on top for viewing what the value is
   //change 6. changed long to char
    public char peak() {
        return stackArray[top];
    }

    //Method to determine whether stack is empty or not
    public boolean isEmpty () {
        return (top == -1); //If there is nothing in the stack, top will be -1, which is how we initiliazed stack
    }


    public boolean isFull() {
        return (maxSize -1 == top); //Top represents the index positon.
    }









}
