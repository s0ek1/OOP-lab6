package io;
import processor.Product;
import processor.ProductsList;
public interface IO {
    public Product[] readObjects(String fileName);
    public void writeObjects(ProductsList products, String fileName);
}