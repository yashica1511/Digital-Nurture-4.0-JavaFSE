public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Watch", "Accessories"),
            new Product(101, "Laptop", "Electronics"),
            new Product(103, "Book", "Stationery"),
            new Product(104, "Phone", "Electronics"),
            new Product(102, "Shoes", "Fashion")
        };

        int searchId = 104;

        System.out.println("Performing Linear Search...");
        Product result1 = SearchService.linearSearch(products, searchId);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));

        System.out.println("\nPerforming Binary Search...");
        SearchService.sortProductsById(products);
        Product result2 = SearchService.binarySearch(products, searchId);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product not found"));
    }
}
