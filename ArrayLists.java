import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Double> numsArray = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        while(true){
            System.out.print("Enter a non-negative number: ");
            double num = keyboard.nextDouble();
            if (num < 0){
                break;
            }
            else{
                numsArray.add(num);
            }
        }

        for (int i = numsArray.size() - 1; i >= 0; i--){
            System.out.println(numsArray.get(i));
        }
    }
}