


 class Item {
     private String name;
     private double price;

     public Item(){}
     public Item(String name, double price){
          this.name = name;
          this.price = price;
     }
     public double getPrice(){
          return price;
     }
     public double getTotalPrice(){
          return 0.0;
     }
     public void printInfo(){
          System.out.println("Item Name: "+ name);
          System.out.println("Price: "+ price);
     }
}
