public class Rectangle
  {
     double length;
     double width;

public double calculateArea()
     {
        return length * width;
     }

public void displayDimensions()
     {
        System.out.println("Length:"+ length);
        System.out.println("Width:"+ width);
     }

public void displayArea()
     {
       System.out.println("Area:"+ calculateArea());
     }

public static void main(String[] args)
     {
       Rectangle rectangle=new Rectangle();
       rectangle.length=5;
       rectangle.width=3;
       rectangle.displayDimensions();
       rectangle.displayArea();
      }
   }