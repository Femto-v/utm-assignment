

class Service extends Item{
     private double man_hours;
     
     public Service(){}
     public Service(String name, double man_hours){
          super(name,15);
          this.man_hours = man_hours;
     }
     public double getTotalPrice(){
          double totalServicePrice;
          if(man_hours>0.5){
               totalServicePrice = 15 + 15 * (man_hours - 0.5);
          } else{
               totalServicePrice = 15;
          }
          return totalServicePrice;
     }
     public void printInfo(){
          super.printInfo();
          System.out.println("Type: Service");
          System.out.println("Man Hours: "+ man_hours);
          System.out.println("Total Price: "+ getTotalPrice());
     }
}