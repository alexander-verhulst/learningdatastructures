package ds.stack;

public class App {

    public static void main (String args []) {

        Stack theStack = new Stack(3); //We provided how big the stack will be// Changed 10 to 3

        //Now we'll push things on to this stack
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80); //First item because we are placing items on top of each other LIFO


        //Print the contents of the stack using while loops
        while (!theStack.isEmpty()) { //While the stack is NOT empty
            long value = theStack.pop(); //Assign whatever is on top to a value and print out
            System.out.println(value);
        }




    }


}
