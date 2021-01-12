import java.util.*;

public class ConcurrentModificationException {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Object mLock = new Object();
 
    ConcurrentModificationException() {
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
    }
 
    private void print() {
        for (int i = 0; i < numbers.size(); i++) {
            synchronized (mLock) {
                System.out.println(numbers.get(i));
            }
        }
    }
 
    private void delete() {
        for (int i : numbers) {
            if (numbers.get(i) / 2 == 0) {
                synchronized (mLock) {
                    numbers.remove(i);
                }
            }
        }
    }
 
    public static void main(String args[]) {
        ConcurrentModificationException test = new ConcurrentModificationException();
        test.delete();
        test.print();
    }
}
