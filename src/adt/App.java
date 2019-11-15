package adt;

import java.util.LinkedList; //This was imported

public class App {

    public static void main (String args []) {
        Counter myCounter = new Counter("myCounter"); //Created an instance of our counter. Initializes at 0
        myCounter.increment(); //Adds 1
        myCounter.increment(); //Adds 1
        myCounter.increment(); // Adds 1
        myCounter.increment(); //Adds 1
        System.out.println(myCounter.getCurrentValue()); //Outputs 4


        LinkedList myList = new LinkedList(); //Ctrl and click LinkedList to access technical code of LinkedList


    }
}
