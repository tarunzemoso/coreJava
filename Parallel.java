import java.util.ArrayList;
import java.util.Scanner;

public class Parallel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int[] age = new int[5];

        for (int i = 0; i < age.length; i++){
            System.out.print("Enter name: ");
            String name = input.nextLine();
            names.add(name);
            System.out.print("Enter age: ");
            age[i] = input.nextInt();
            input.nextLine();
            System.out.println();
        }

        for (int i = 0; i < age.length; i++){
            System.out.println(names.get(i)+" is "+age[i]+" years old");
        }
    }
}