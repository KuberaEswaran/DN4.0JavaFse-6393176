
import java.util.Arrays;

class Product {

    int productId;
    String productName, category;

    public Product(int pid, String pname, String cat) {
        productId = pid;
        productName = pname;
        category = cat;
    }

    @Override
    public String toString() {
        return " ProductId:" + productId + ", ProductName:" + productName + ", category:" + category;
    }

}

public class EcommercePlatform {

    static Product LinearSearchProduct(int id, Product[] product) {
        for (Product p : product) {
            if (p.productId == id) {
                return p;
            }
        }
        return null;
    }

    static Product BinarySearchProduct(int id, Product[] product) {
        int low = 0, high = product.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int pid = product[mid].productId;
            if (pid == id) {
                return product[mid];
            } else if (pid < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] product = new Product[2];
        product[0] = new Product(1002, "lays", "snack");
        product[1] = new Product(1001, "slice", "juice");
        System.out.println("Array Before Sorting Based on Id:");
        for (int i = 0; i < 2; i++) {
            System.out.println(product[i]);
        }
        Arrays.sort(product, (a, b) -> a.productId - b.productId);
        System.out.println();
        System.out.println("Array After Sorting Based on id:");
        for (int i = 0; i < 2; i++) {
            System.out.println(product[i]);
        }
        System.out.println();
        //Linear Search of 1002
        //tc->o(n) because it will search the product one by one
        Product linearProduct = LinearSearchProduct(1002, product);
        //Binary Search of id 1002
        //tc->o(log n) because it will search the product based on log2(n)
        Product binaryProduct = BinarySearchProduct(1002, product);
        System.out.println("Linear searched:" + linearProduct + "\nBinary Searched:" + binaryProduct);

    }
}

//if the the algorithm sorted we should go for binary search
//which gives us less Time Complexity
//so incase if it is not sorted we should go for linear search
//linear
//best-o(1),average-o(n),worst-o(n)
//binary
//best-o(1),avg/worst-o(log n)
