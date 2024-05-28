import java.util.Vector;

public class TestCustomer {
     public static void main(String[] args) {
          Customer customer = new Customer("Alice", "456", "No. 6, KTC UTM, Johor", "011-7123987");
          customer.addItem(new Material("Engine Oil", 130.8, "Semi Synthetic 15W/40",2));
          customer.addItem(new Material("Oil Filter", 18.3, "Saga OEM",2));
          customer.addItem(new Service("Engine Oil Service",0.8));
          //display
          System.out.println("Test 'Customer' class:\n----------------------");
          customer.printInfo();

     }
}
