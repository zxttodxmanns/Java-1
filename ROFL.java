public class ROFL {

    public static void main(String[] args) {
        Main.Food food = new Main.Food("Apple", 0.99, 10, "Fruit");
        double totalPrice = food.calculateTotalPrice();
        double discount = food.calculateDiscount(10);
        double totalCost = food.calculateTotalCost(10);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Total cost: " + totalCost);
    }
}
