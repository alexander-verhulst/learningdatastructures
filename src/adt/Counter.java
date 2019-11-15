package adt;

public class Counter { //All of this is our abstract data

   private String name = null; //These are private so no one can change their fields
    private int value = 0;

    public Counter(String str) {
        this.name = str;
    }

    public void increment()  {
        value++;
    }

    public int getCurrentValue(){
        return value;
    }

    public String toString() {
        return name + ": " + value;
    }


}
