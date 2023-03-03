package ui;

import processor.Product;
import processor.ProductsList;

import java.time.LocalDate;
import java.util.Scanner;

public class UIProducts implements UI {
    Product[] tempProducts = new Product[0];
    public void addNewProduct(ProductsList products, Scanner scanner) {
        System.out.print("Введіть id: ");
        int id = scanner.nextInt();
        System.out.print("Введіть назву: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Введіть виробника: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Введіть вартісь: ");
        double cost = scanner.nextDouble();
        System.out.print("Введіт год, місяць, і день терміну: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        System.out.print("Введіть кількість: ");
        int count = scanner.nextInt();
        products.addProduct(new Product(id, name, manufacturer, cost, LocalDate.of(year, month, day), count));
    }
    public void showProducts(ProductsList products) {
            System.out.println(products);
    }
    @Override
    public void fillProductArray(ProductsList products) {
        products.addProduct(new Product(1,"Шампунь",        "Nivea",    111.50,LocalDate.of(2023, 2,20), 45));
        products.addProduct(new Product(2,"Шоколад",        "Roshen",   38.75, LocalDate.of(2023, 2,15), 100));
        products.addProduct(new Product(3,"Кава",           "Jacob",    427.60,LocalDate.of(2024, 6,7),   37));
        products.addProduct(new Product(4,"Чайек",          "Loyd",     28.90, LocalDate.of(2024, 8,8),   12));
        products.addProduct(new Product(5,"Горілка",        "Гетьман",  147.60,LocalDate.of(2023, 2,3),19));
        products.addProduct(new Product(6,"Масло",          "Ферма",    46.50, LocalDate.of(2033, 9,30),  23));
        products.addProduct(new Product(7,"Кава",           "Nescafe",  4.90,  LocalDate.of(2025, 8,19), 65));
        products.addProduct(new Product(8,"Цукерки",        "Roshen",   19.90, LocalDate.of(2024, 3,31), 81));
        products.addProduct(new Product(9,"Круасан",        "Ligos",    30.80, LocalDate.of(2023, 2,3),  60));
        products.addProduct(new Product(10,"Молоко",        "Ферма",    33.40, LocalDate.of(2022, 12,31),  43));
    }

    public void clearProductsArray(ProductsList products) {
        products.formatProductsList(tempProducts);
    }
    @Override
    public void deleteElementById(ProductsList products, Scanner scanner) {
        System.out.print("Ведіть id для вилучення: ");
        int id = scanner.nextInt();
        products.deleteById(id);
    }
}
