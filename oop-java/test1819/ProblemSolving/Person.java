

 class Person {
     private String name;
     private String ic_no;

     public Person(){}
     public Person(String name, String ic_no){
          this.name = name;
          this.ic_no = ic_no;
     }
     public void printInfo(){
          System.out.println("Name: "+name);
          System.out.println("IC No.: "+ic_no);
     }
}
