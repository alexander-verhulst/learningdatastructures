package ds.queue;

public class Queue {

    private int maxSize; //initial container with set number of slots.
    private long [] queArray; //slot to maintain the data. Array is rudimentary ds used in many other languages
    private int front; //index position for element in front
    private int rear; //index position for the element in the rear
    private int nItems; //counter to maintain the number of items in our queue

    //create a constructor to initialize Queue
    public Queue (int size) { //only one parameter of size to initialize the array
        this.maxSize = size; //maxSize equals the size that was passed in
        this.queArray = new long [size];//above variable we only define the array. Here we initialize the array
        front = 0; //index pos of the first slot of the array
        rear = -1; // there is no item in the array yet to be considered as the last item
        nItems = 0; //we don't have elements in array, that is why it is 0
    }

    //create method #1 This method helps us put data into the end of the queue
    public void insert(long j) { //we have a parameter that accepts data types of long because our array also accepts
        // long

        //This if statement that just recycles the 5 numbers in the queue is referred as a "CIRCULAR QUEUE".
        //The circular queue is just one type of implementation. Can also have it notify the user that they reached
        //the max size of the queue.
        if (rear == maxSize - 1) { //rear points to the index position of the length of array -1, if rear equals that
            rear = -1; //we just bring it back to beginning
        } //when we insert a new element in the main, the new number will override and replace whatever is in the first
        // position. since
        //we set slot size to 5, it just replaces the first slot. We will also make the second to last element the
        //new rear with rear = -1


        rear++;//**Whenever we insert items into a queue, they go to the end of the array**. When we increment it goes
        // from -1 to 0
        queArray[rear] = j; //we put the data at the 0 index position. That's why it is important to initialize at -1
        nItems ++;
    }

    //create method #3. When we remove a method from the line, we remove it from the front of queue
    public long remove() {

       long temp = queArray[front]; //first get element in front of line. we extract whatever is in the index position
        // of the "front" value
        front ++; //since we pulled the index value from the original front, we increment to create the new
        // front position
        if (front == maxSize) { //if front is equal to the maxSize, that means we removed everything from the queue
            front = 0; //we can set front back to the 0th index so that we can utilize the entire array again
         }
        nItems --; //we reduced the numbers in the line
        return temp; //since we are removing the element, that is the item we return
    }

    //create method #4. We create this method to just find out what element is in the front
    public long peekFront() {
        return queArray[front]; //return the queue array, at the position front. Front is a pointer, we are not
        // changing the value, we are just observing who is at front
    }

    //create method #5. Create boolean method
    public boolean isEmpty () {
        return (nItems == 0);
    }

    //create method #6. Create boolean method
    public boolean isFull () {
        return (nItems == maxSize);
    }




    // create method #2. This method allows us to view the contents of the queue
    public void view() {
        System.out.print("[");
        //Create a loop to go over the array
        for (int i = 0; i < queArray.length; i++ ) { //As long as i is lower the array length, keep adding i
            System.out.print(queArray[i] + " "); //print the value of particular index pos in the array
        }
        System.out.print("]");
    }








}
