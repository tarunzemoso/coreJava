import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] numsArray = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numsArray.length; i++){
            System.out.print("Enter an integer: ");
            numsArray[i] = input.nextInt();
        }

        for (int i = 0; i < numsArray.length; i++){
            System.out.println("Result is " + (numsArray[i]*2));
        }
    }
}