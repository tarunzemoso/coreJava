import java.util.*;
public class guessnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int count=0;
        while(true){
            System.out.println("Enter your guessed number");
            int guessednumber=sc.nextInt();
            int generatednumber= random.nextInt(10)+1;
            count++;
            if(guessednumber==generatednumber)
            {
                System.out.println("correct!!!!!");
                break;
            }
            else
                System.out.println("wrong!!!!!");
        }
        System.out.println("Total Guessed Numbers: "+count);
    }
}
