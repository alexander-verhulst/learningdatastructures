package ds.stack;

public class App {

    //Reverse a string
    public static String reverseString(String str) {
        int stackSize = str.length(); //get the max stack size
        Stack theStack = new Stack(stackSize); //we make the stack
        for (int j = 0; j < str.length();j++) {
            char ch = str.charAt(j); //geting a char from the input string
            theStack.push(ch);
        }
        String result = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            result = result+ ch; //appending to the output
        }
        return result;
    }

    public static void main (String args []) {

        Stack theStack = new Stack(3); //We provided how big the stack will be// Changed 10 to 3

        /*
        //Now we'll push things on to this stack
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80); //First item because we are placing items on top of each other LIFO


        //Print the contents of the stack using while loops
        while (!theStack.isEmpty()) { //While the stack is NOT empty
            long value = theStack.pop(); //Assign whatever is on top to a value and print out
            System.out.println(value);
        } */

       System.out.println(reverseString("HELLO"));


    }


}
