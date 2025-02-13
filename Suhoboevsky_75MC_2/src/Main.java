class Main {
    public static void main(String[] args) {
        Food food = new Food("Apple", 0.99, 10, "Fruit");
        double totalPrice = food.calculateTotalPrice();
        double discount = food.calculateDiscount(10);
        double totalCost = food.calculateTotalCost(10);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Total cost: " + totalCost);
    }
    public static class Food {
        private String name;
        private double price;
        private int quantity;
        private String category;

        @Override
        public String toString() {
            return "Food{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    ", category='" + category + '\'' +
                    '}';
        }

        public Food(String name, double price, int quantity, String category)
        {
            this.name = name;
            this.price = price;

            this.quantity = quantity;
            this.category = category;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        public String getCategory() {
            return category;
        }
        public void setCategory(String category) {
            this.category = category;
        }
        public double calculateTotalPrice() {
            return price * quantity;
        }
        public double calculateDiscount(double discountPercentage) {
            return calculateTotalPrice() * (discountPercentage / 100);
        }
        public double calculateTotalCost(double discountPercentage) {
            return calculateTotalPrice() - calculateDiscount(discountPercentage);
        }
    }
}