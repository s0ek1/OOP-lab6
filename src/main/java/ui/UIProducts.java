package ui;
import processor.Product;
import processor.ProductsList;
import java.time.LocalDate;
import java.util.Scanner;
public class UIProducts implements UI {
    public void addNewProduct(ProductsList products, Scanner scanner) {
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
        products.addProduct(new Product( name, manufacturer, cost, LocalDate.of(year, month, day), count));
    }
    public void showProducts(ProductsList products) { System.out.println(products); }
    @Override
    public void fillProductArray(ProductsList products) {
        products.addProduct(new Product("Шампунь",        "Nivea",    111.50,LocalDate.of(2023, 2,20), 45));
        products.addProduct(new Product("Шоколад",        "Roshen",   38.75, LocalDate.of(2023, 2,15), 100));
        products.addProduct(new Product("Кава",           "Jacob",    427.60,LocalDate.of(2024, 6,7),   37));
        products.addProduct(new Product("Чайек",          "Loyd",     28.90, LocalDate.of(2024, 8,8),   12));
        products.addProduct(new Product("Горілка",        "Гетьман",  147.60,LocalDate.of(2023, 2,3),19));
        products.addProduct(new Product("Масло",          "Ферма",    46.50, LocalDate.of(2033, 9,30),  23));
        products.addProduct(new Product("Кава",           "Nescafe",  4.90,  LocalDate.of(2025, 8,19), 65));
        products.addProduct(new Product("Цукерки",        "Roshen",   19.90, LocalDate.of(2024, 3,31), 81));
        products.addProduct(new Product("Круасан",        "Ligos",    30.80, LocalDate.of(2023, 2,3),  60));
        products.addProduct(new Product("Молоко",        "Ферма",     33.40, LocalDate.of(2022, 12,31),  43));
    }
    @Override
    public void deleteElementById(ProductsList products, Scanner scanner) {
        System.out.print("Ведіть id для вилучення: ");
        int id = scanner.nextInt();
        products.deleteById(id);
        showProducts(products);
    }
    @Override
    public void printProductWithCost(ProductsList products, Scanner scanner) {
        scanner.nextLine();
        System.out.print("Ведіть назву продукта: ");
        String name = scanner.nextLine();
        System.out.print("Ведіть вартісь продукта: ");
        int cost = scanner.nextInt();
        products.printProductWithCost(name, cost);
    }
    @Override
    public void printProductWithTerm(ProductsList products, Scanner scanner) {
        System.out.print("Введіт год, місяць, і день терміну: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        products.printProductWithTerm(date);
    }
    @Override
    public void printProductWithSortTerm(ProductsList products) {
        products.sortByTerm();
        showProducts(products);
    }
    @Override
    public void printProductWithSortCost(ProductsList products) {
        products.sortByCost();
        showProducts(products);
    }
}