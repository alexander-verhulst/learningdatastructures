package ds.queue;

public class App {

    //A queue is like the line at the store. Whoever comes first, leaves first FIFO.

    public static void main(String[] args) {
        Queue myQueue = new Queue(5); //We initialize Queue, give the name myQueue, and give it a size of 5 slots

        myQueue.insert(100); //slot 1
        myQueue.insert(1000); //slot 2
        myQueue.insert(14); //slot 3
        myQueue.insert(12); //slot 4
        myQueue.insert(44); //slot 5
        myQueue.insert(69); //slot 6. since we only gave a maxSize of 5, this  number will replace teh first number
        //which is 100. 44 will become the new rear. [69 1000 14 12 44 ]. If we keep inserting this number. This process
        //will keep repeating

       // myQueue.insert(2); we only gave initial size of 5 slots. If try and run you get this message. java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        myQueue.view(); //call the view method to see what is in the data structure. Whatever was inserted first will be displayed first [100 1000 14 12 44 ]


    }

}
