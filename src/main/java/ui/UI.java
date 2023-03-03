package ui;

import processor.ProductsList;

import java.util.Scanner;

public interface UI {
    public void addNewProduct(ProductsList products, Scanner scanner);
    public void fillProductArray(ProductsList products);
    public void showProducts(ProductsList products);
    public void clearProductsArray(ProductsList products);

    void deleteElementById(ProductsList products, Scanner scanner);
}

