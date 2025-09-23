import java.io.*;
import java.util.*;

public class OddEvenMultithreading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int start;
           int end;
           System.out.print("Enter the starting range :");
            start=end=sc.nextInt();
           System.out.print("Enter the ending range :");
            end=sc.nextInt();
        
        Thread evenThread = new Thread(new EvenNumbersGenerator(start, end));
        Thread oddThread = new Thread(new OddNumbersGenerator(start, end));
        
        evenThread.start();
        oddThread.start();
        
    }
}
class EvenNumbersGenerator implements Runnable {
    private int start;
    private int end;
    public EvenNumbersGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        System.out.println("Even numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
class OddNumbersGenerator implements Runnable {
    private int start;
    private int end;

    public OddNumbersGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("Odd numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
