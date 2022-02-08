import java.util.ArrayList;

class IceCream {
    String name;
    int cost;
    int numScoops;
    ArrayList<String> toppings;

    public IceCream(String name, int cost, int numScoops) {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    int getNumScoops() {
        return numScoops;
    }

    void printToppings() {
        for (String topping : toppings) {
            System.out.println("\t" + topping);
        }
    }
}
public class IceCreamClass {
        public static void main(String[] args) {
            IceCream myIC = new IceCream("Chocolate", 3, 2);
            IceCream yourIC = new IceCream("Strawberry", 2, 1);
            myIC.addTopping("nuts");
            myIC.addTopping("cherries");
            yourIC.addTopping("springles");
            printIC(myIC);
            printIC(yourIC);
        }

        static void printIC(IceCream icecream) {
            System.out.println(icecream.getName());
            System.out.println("Cost: $'" + icecream.getCost());
            System.out.println("Topped with:");
            icecream.printToppings();
            System.out.println();
        }
}