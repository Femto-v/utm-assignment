import java.util.Vector;
import java.text.DecimalFormat;

class Customer extends Person{
     private String address;
     private String phone;
     private Vector<Item> item;

     public Customer(){
          this.item  = new Vector<>();
     }
     public Customer(String name, String ic_no, String address, String phone){
          
          super(name, ic_no);
          this.address = address;
          this.phone = phone;
          this.item  = new Vector<>();
     }
     public void addItem(Item item){
          this.item.add(item);
     }
     public void printInfo(){
          super.printInfo();
          System.out.println("Address: "+address );
          System.out.println("Phone: "+phone );
          System.out.println(" ");
          System.out.println("Ordered Item(s):");
          System.out.println("................\n");
          double grandPrice= 0.0;
          for (Item itemForeach : item) {
               grandPrice += itemForeach.getTotalPrice();
               itemForeach.printInfo();
               System.out.println(" ");
          }
          DecimalFormat df = new DecimalFormat("#.00");
          String formattedGrandPrice = df.format(grandPrice);
          System.out.println("GRAND TOTAL PRICE:" + formattedGrandPrice);
     }

}
