import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
            }

            ListIterator<Integer> it = list.listIterator();
            
            System.out.print("Forward: ");
            while (it.hasNext()) {
                System.out.print(it.next() + (it.hasNext() ? " " : ""));
            }
            System.out.println();

            System.out.print("Backward: ");
            while (it.hasPrevious()) {
                System.out.print(it.previous() + (it.hasPrevious() ? " " : ""));
            }
            System.out.println();
        }
        scanner.close();
    }
}
