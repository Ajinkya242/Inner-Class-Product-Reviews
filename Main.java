public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101,"Smartphone", 20000);
        Product p2 = new Product(202, "Laptop" , 80000);
        Product p3 = new Product(303, "Headphone", 4000);

        p1.addReview(4.5f, "Great phone with awesome features", "Amazing product");
        p1.addReview(3.0f, "Battery life could be better" , "Ok Product");
        System.out.println();

        p2.addReview(5.0f, "Fantastic performance and build quality" , "Highly Recommended");
        p2.addReview(4.2f, "Good value for money, but could improve battery", "Worth the price");
        System.out.println();

        p3.addReview(4.8f, "Excellent sound quality and comfort", "Great Headphones");
        p3.addReview(2.5f, "Sound quality is good, but not very comfortable", "Average Product");
        System.out.println();

        System.out.println("Smartphones Reviews: ");
        p1.printReviews();

        System.out.println("\nLaptop Reviews: ");
        p2.printReviews();

        System.out.println("\nHeadphones Reviews: ");
        p3.printReviews();

        p1.removeReview(0);
        System.out.println("\nSmartphone Reviews after removal:");
        p1.printReviews();


    }
}