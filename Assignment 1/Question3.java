import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int dosaPrice = 50, samosaPrice = 10, idliPrice = 15, pizzaPrice = 100;
        int burgerPrice = 50, momoPrice = 50, sandwichPrice = 30;
        int vadaPavPrice = 20, pattyPrice = 25, teaPrice = 10;

        
        int dosaQuantity = 0, samosaQuantity = 0, idliQuantity = 0, pizzaQuantity = 0;
        int burgerQuantity = 0, momoQuantity = 0, sandwichQuantity = 0;
        int vadaPavQuantity = 0, pattyQuantity = 0, teaQuantity = 0;

        while (true) {
            System.out.println("\nWelcome to the Restaurant!");
            System.out.println("1. Dosa - Rs. " + dosaPrice);
            System.out.println("2. Samosa - Rs. " + samosaPrice);
            System.out.println("3. Idli - Rs. " + idliPrice);
            System.out.println("4. Pizza - Rs. " + pizzaPrice);
            System.out.println("5. Burger - Rs. " + burgerPrice);
            System.out.println("6. Momo - Rs. " + momoPrice);
            System.out.println("7. Sandwich - Rs. " + sandwichPrice);
            System.out.println("8. Vada Pav - Rs. " + vadaPavPrice);
            System.out.println("9. Patty - Rs. " + pattyPrice);
            System.out.println("10. Tea - Rs. " + teaPrice);
            System.out.println("11. Generate Bill");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            int quantity;

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity for Dosa: ");
                    quantity = sc.nextInt();
                    dosaQuantity += quantity;
                    break;
                case 2:
                    System.out.print("Enter quantity for Samosa: ");
                    quantity = sc.nextInt();
                    samosaQuantity += quantity;
                    break;
                case 3:
                    System.out.print("Enter quantity for Idli: ");
                    quantity = sc.nextInt();
                    idliQuantity += quantity;
                    break;
                case 4:
                    System.out.print("Enter quantity for Pizza: ");
                    quantity = sc.nextInt();
                    pizzaQuantity += quantity;
                    break;
                case 5:
                    System.out.print("Enter quantity for Burger: ");
                    quantity = sc.nextInt();
                    burgerQuantity += quantity;
                    break;
                case 6:
                    System.out.print("Enter quantity for Momo: ");
                    quantity = sc.nextInt();
                    momoQuantity += quantity;
                    break;
                case 7:
                    System.out.print("Enter quantity for Sandwich: ");
                    quantity = sc.nextInt();
                    sandwichQuantity += quantity;
                    break;
                case 8:
                    System.out.print("Enter quantity for Vada Pav: ");
                    quantity = sc.nextInt();
                    vadaPavQuantity += quantity;
                    break;
                case 9:
                    System.out.print("Enter quantity for Patty: ");
                    quantity = sc.nextInt();
                    pattyQuantity += quantity;
                    break;
                case 10:
                    System.out.print("Enter quantity for Tea: ");
                    quantity = sc.nextInt();
                    teaQuantity += quantity;
                    break;
                case 11:
                    
                    int total = (dosaQuantity * dosaPrice) + (samosaQuantity * samosaPrice) + 
                                (idliQuantity * idliPrice) + (pizzaQuantity * pizzaPrice) +
                                (burgerQuantity * burgerPrice) + (momoQuantity * momoPrice) +
                                (sandwichQuantity * sandwichPrice) + (vadaPavQuantity * vadaPavPrice) +
                                (pattyQuantity * pattyPrice) + (teaQuantity * teaPrice);

                    System.out.println("\n----- Bill Summary -----");
                    if (dosaQuantity > 0) System.out.println("Dosa x " + dosaQuantity + " = Rs. " + (dosaQuantity * dosaPrice));
                    if (samosaQuantity > 0) System.out.println("Samosa x " + samosaQuantity + " = Rs. " + (samosaQuantity * samosaPrice));
                    if (idliQuantity > 0) System.out.println("Idli x " + idliQuantity + " = Rs. " + (idliQuantity * idliPrice));
                    if (pizzaQuantity > 0) System.out.println("Pizza x " + pizzaQuantity + " = Rs. " + (pizzaQuantity * pizzaPrice));
                    if (burgerQuantity > 0) System.out.println("Burger x " + burgerQuantity + " = Rs. " + (burgerQuantity * burgerPrice));
                    if (momoQuantity > 0) System.out.println("Momo x " + momoQuantity + " = Rs. " + (momoQuantity * momoPrice));
                    if (sandwichQuantity > 0) System.out.println("Sandwich x " + sandwichQuantity + " = Rs. " + (sandwichQuantity * sandwichPrice));
                    if (vadaPavQuantity > 0) System.out.println("Vada Pav x " + vadaPavQuantity + " = Rs. " + (vadaPavQuantity * vadaPavPrice));
                    if (pattyQuantity > 0) System.out.println("Patty x " + pattyQuantity + " = Rs. " + (pattyQuantity * pattyPrice));
                    if (teaQuantity > 0) System.out.println("Tea x " + teaQuantity + " = Rs. " + (teaQuantity * teaPrice));

                    System.out.println("Total Bill: Rs. " + total);
                    System.out.println("Thank you for dining with us!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
