


class Material extends Item{
     private String spec;
     private int qty;

     public Material(){}
     public Material(String name, double price, String spec, int qty){
          super(name, price);
          this.spec = spec;
          this.qty = qty;
     }
     public double getTotalPrice(){
          return  getPrice() * qty;
     }
     public void printInfo(){
          super.printInfo();
          System.out.println("Type: Material");
          System.out.println("Spec.: "+ spec);
          System.out.println("Quantity: "+ qty);
          System.out.println("Total Price: "+ getTotalPrice());
          
     }
}
