package main;
import io.IOProcessor;
import processor.ProductsList;
import ui.UIProducts;
import java.util.Scanner;
public class Main {
    public static final String fileNameTXT = "product.txt";
    public static final String fileNameDat = "product.dat";
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private void run() {
        UIProducts functions = new UIProducts();
        ProductsList products = new ProductsList();
        IOProcessor io = new IOProcessor();
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        while (status) {
            menu();
            int option = scanner.nextInt();
            switch (option) {
                case 0 -> status = false;

                case 1 -> io.writeObjects(products, fileNameTXT);
                case 2 -> products.formatProductsList(io.readObjects(fileNameTXT));
                case 3 -> io.writeObjects(products, fileNameDat);
                case 4 -> products.formatProductsList(io.readObjects(fileNameDat));
                case 5 -> functions.fillProductArray(products);

                case 6 -> functions.addNewProduct(products, scanner);
                case 7 -> functions.deleteElementById(products, scanner);
                case 8 -> functions.showProducts(products);
                case 9 -> functions.printProductWithSortTerm(products);
                case 10 -> functions.printProductWithCost(products,scanner);
                case 11 -> functions.printProductWithTerm(products,scanner);
                case 12 -> functions.printProductWithSortCost(products);
            }
        }
    }
    private void menu() {
        System.out.print("""
                            ======================== ========================
                            Выберите пункт из меню:
                            [0] - Завершити програму.
                            [1] - Зберігання даних у текстовий файл.    [2] - Зчитування з текстового файлу.
                            [3] - Зберігання даних у бінарний файл.     [4] - Зчитування з бінарного файлу.
                            [5] - Зчитування з коду.
                            [6] - Додати новий продукт.
                            [7] - Вилучити по ID.
                            [8] - Вивести весь список продуктів.
                            [9] - Вивести список продуктів в порядку спадання терміну зберігання.
                            [10] - Вивести список продуктів для заданого найменування, ціна яких не перевищує задану.
                            [11] - Вивести список товарів, термін зберігання яких більше заданого.
                            [12] - Вивести список продуктів впорядкованих за зростанням вартості.
                         :""");
    }
}