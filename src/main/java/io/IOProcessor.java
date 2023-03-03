package io;
import processor.Product;
import processor.ProductsList;
import java.io.*;
public class IOProcessor implements IO  {
    @Override
    public Product[] readObjects(String fileName) {
        try (ObjectInputStream something = new ObjectInputStream(new FileInputStream(fileName))) {
            Product[] prods = (Product[]) something.readObject();
            System.out.println("Файл УСПЕШНО Прочитан!");
            return prods;
        } catch (IOException e) {
            System.out.println("File Read ERROR! [1]");
        } catch (ClassNotFoundException e) {
            System.out.println("File Read ERROR! [2]");
        }
        return new Product[0];
    }
    @Override
    public void writeObjects(ProductsList products, String fileName) {
        try (ObjectOutputStream something = new ObjectOutputStream(new FileOutputStream(fileName))) {
            something.writeObject(products.getProducts());
            System.out.println("Файл УСПЕШНО Записан!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}