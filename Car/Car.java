public class Car
 {
    String make;
    String model;
    int year;
void displayInfo()
   {
     System.out.println("Make:"+ make);
     System.out.println("Model:"+ model);
     System.out.println("Year:"+ year);
 
    }
     public static void main(String[] args)
  {
     Car car1=new Car();
     car1.make="Japan";
     car1.model="Toyota";
     car1.year=2022;
   
     car1.displayInfo();
   }
 }

     
 