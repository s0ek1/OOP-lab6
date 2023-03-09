package processor;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ProductsList {
    private int size = 0;
    private Product[] products = new Product[10];
    public void addProduct(Product product) {
        ensureCapacity(size+1);
        products[size++] = product;
    }
    public Product[] getProducts() { return products; }
    public void printProductWithCost(String name, double cost) {

        for (int i = 0; i < size; i++) {
            if(name.equals(products[i].getName())) {
                if (products[i].getCost() <= cost) {
                    System.out.println(products[i]);
                }
            }
        }
    }
    public void printProductWithTerm(LocalDate term) {
        for (int i = 0; i < size; i++) {
            if (products[i].getTerm().isAfter(term)) {
                System.out.println(products[i]);
            }
        }
    }
    public void deleteById(int id){
        Product[] tempProducts = new Product[products.length];
        int k = 0;
        for (int i = 0 ; i < size; i++) {
            if (products[i].getId() != id) {
                tempProducts[k] = products[i];
                k++;
            }
        }
        size = k;
        products = Arrays.copyOf(tempProducts, k);
    }
    public void formatProductsList(Product[] tempProducts){
        products = tempProducts;
        size = products.length;
    }
    private void ensureCapacity(int newCapacity) {
        int tempSize;
        if(products.length==0) tempSize = 1; else tempSize = products.length * 2;
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

    public void sortByTerm() {
        Product[] newArray = new Product[size];
        System.arraycopy(products, 0, newArray, 0, size);

        Arrays.sort(newArray, Comparator.comparing(Product::getTerm).reversed());
        System.arraycopy(newArray, 0, products, 0, size);

    }

    public void sortByCost() {
        Product[] newArray = new Product[size];
        System.arraycopy(products, 0, newArray, 0, size);
        Arrays.sort(newArray);
        System.arraycopy(newArray, 0, products, 0, size);
    }
}