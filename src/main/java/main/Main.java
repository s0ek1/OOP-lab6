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
                case 5 -> functions.addNewProduct(products, scanner);
                case 6 -> functions.deleteElementById(products, scanner);
                case 7 -> functions.showProducts(products);
                case 8 -> functions.fillProductArray(products);
                case 9 -> functions.clearProductsArray(products);
                case 10 -> functions.printProductWithName(products, scanner);
                case 11 -> functions.printProductWithCost(products, scanner);
                case 12 -> functions.printProductWithTerm(products, scanner);
            }
        }
    }
    private void menu() {
        System.out.print("""
                            ======================== ========================
                            Выберите пункт из меню:
                            [0] - Завершити програму.
                            [1] - Зберігання даних у текстовий файл.
                            [2] - Зчитування з текстового файлу.
                            [3] - Зберігання даних у бінарний файл.
                            [4] - Зчитування з бінарного файлу.
                            [5] - Додати новий продукт.
                            [6] - Вилучити по ID.
                            [7] - Вивести весь список продуктів.
                            [8] - Заповнити список продуктів з коду.
                            [9] - clear product.
                            [10] - Вивести список продуктів по назві.
                            [11] - Вивести список продуктів по вартості.
                            [12] - Вивести список продуктів по терміну придатності
                            .
                         :""");
    }
}