package io;
import processor.Product;
import processor.ProductsList;
public interface IO {
    Product[] readObjects(String fileName);
    void writeObjects(ProductsList products, String fileName);
}