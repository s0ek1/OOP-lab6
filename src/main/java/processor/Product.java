package processor;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
public class Product implements Serializable {
        //Product: id, Найменування, Виробник, Ціна, Термін зберігання, Кількість.
        private int id; //id
        private String name; //Найменування
        private String manufacturer; //Виробник
        private double cost; //Ціна
        private LocalDate term; //Термін зберігання
        private int count; //Кількість
        public Product(int id, String name, String manufacturer, double cost, LocalDate term, int count) {
            this.id = id; this.name = name; this.manufacturer = manufacturer;
            this.cost = cost; this.term = term; this.count = count;
        }
        public void setID(int id) { this.id = id; }
        public void setName(String name) { this.name = name; }
        public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
        public void setCost(double cost) { this.cost = cost; }
        public void setTerm(LocalDate term) { this.term = term; }
        public void setCount(int count) { this.count = count; }
        public int getId() { return id; }
        public String getName() { return name; }
        public String getManufacturer() { return manufacturer; }
        public double getCost() { return cost; }
        public LocalDate getTerm() { return term; }
        public int getCount() { return count; }
        @Override
        public String toString() {
            return "\t[id|"+ id +
                    "]\tname = '" + name + '\'' +
                    "   \tВиробник = '" + manufacturer + '\'' +
                    "   \tcost = " + cost +
                    "  \tterm = '" + term + '\'' +
                    "  \tcount = " + count;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return
                    id == product.id &&
                    cost == product.cost &&
                    count == product.count &&
                    Objects.equals(name, product.name);
        }
}