package processor;
import java.util.Arrays;
public class ProductsList {
    private int size = 0;
    private Product[] products = new Product[10];
    public void addProduct(Product product) {
        ensureCapacity(size+1);
        products[size++] = product;
    }
    public Product[] getProducts() { return products; }
    public void printProductWithName() {}
    public void printProductWithCost() {}
    public void printProductWithTerm() {}
    public void deleteById(int id){
        Product[] prods = new Product[products.length-1];
        int num = 0;
        for (int i = 0, k = 0; i < size; i++) {
            if (products[i].getId() != id) {
                prods[k] = products[i];
                k++;
            }else num++;
        }
        size =- num;
        products = Arrays.copyOf(prods, prods.length);
    }
    public void formatProductsList(Product[] tempProducts){
        products = tempProducts;
        size = products.length;
    }
    private void ensureCapacity(int newCapacity) {
        int tempSize;
        if(products.length==0) {tempSize = 1;} else tempSize = products.length * 2;
        if (newCapacity <= products.length) return;
        Product[] newArray = new Product[tempSize];
        System.arraycopy(products, 0, newArray, 0, products.length);
        products = newArray;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(products[i]).append(",\n");
        }
        return sb.toString();
    }
}