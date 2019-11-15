package adt;

public class Main {

    public int countEvens (int elements[]) {

        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i]%2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main (String args []) {

        int [] elements = {2,45,56,58,3,5,64,74,54};

        int scores = -3;
        while (scores < 8) {
            scores += 3;
            System.out.print(scores + " ");
        }

        int sum = 0;
        for (int i= 1; i <= 5; i++) {
            sum+=i;
            i++;
        }

        System.out.println("answer");
        System.out.println(sum);




    }

}
