import java.util.Scanner;

public class LearningPackages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your package? 1, 2, or 3?: ");
        int userPackage = input.nextInt();
        System.out.println("Enter number of courses purchased:");
        int totalCourses = input.nextInt();
        int standardCost;
        int standardCourses;
        int additionalCostPerCourse;
        int totalCost = 0;

        if (userPackage == 1) {
            standardCost = 10;
            standardCourses = 2;
            additionalCostPerCourse = 6;
        }
        else if (userPackage == 2) {
            standardCost = 12;
            standardCourses = 4;
            additionalCostPerCourse = 4;
        }
        else {
            standardCost = 15;
            standardCourses = 6;
            additionalCostPerCourse = 3;
        }

        if (totalCourses > standardCourses) {
            totalCost = standardCost + (totalCourses - standardCourses) * additionalCostPerCourse;
            System.out.println("Total cost: $" + totalCost);
        }
        else {
            System.out.println("Total cost: $" + (standardCost * standardCourses));
        }
    }
}
