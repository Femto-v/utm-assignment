import java.util.ArrayList;
public class TestItem {
     public static void main(String[] args) {

          //declare and initate
          ArrayList<Item> materials = new ArrayList<>();
          materials.add(new Material("Engine Oil", 130.8, "Semi Synthetic 15W/40", 2));
          
          ArrayList<Item> services = new ArrayList<>();
          services.add(new Service("Engine Oil Service",0.5));
          services.add(new Service("Major Service",2.8));

          //output
          System.out.println("Test 'Material' class: \n---------------------- ");
          for (Item item : materials) {
               item.printInfo();
               System.out.println(" ");
          }
          System.out.println("Test 'Services' class: \n---------------------- ");
          for (Item item : services) {
               item.printInfo();
               System.out.println(" ");
          }

     }
}
