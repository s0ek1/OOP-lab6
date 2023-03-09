package ui;
import processor.ProductsList;
import java.util.Scanner;
public interface UI {
    void addNewProduct(ProductsList products, Scanner scanner);
    void fillProductArray(ProductsList products);
    void showProducts(ProductsList products);
    void clearProductsArray(ProductsList products);
    void deleteElementById(ProductsList products, Scanner scanner);
    void printProductWithName(ProductsList products, Scanner scanner);
    void printProductWithCost(ProductsList products, Scanner scanner);
    void printProductWithTerm(ProductsList products, Scanner scanner);

}