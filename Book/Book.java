public class Book
   {
     String title;
     String author;
     int year;
public void displayInfo()
   {
     System.out.println("Title:"+ title);
     System.out.println("Author:"+ author);
     System.out.println("Year:"+ year);
   }
public static void main(String[] args)
   { 
      Book book1=new Book();
      book1.title="Madolduwa";
      book1.author="Martin Wikramasighe";
      book1.year=2000;

      Book book2=new Book();
      book2.title="senkottan";
      book2.author="Mahinda Prasad Dalupitiya";
      book2.year=2012;

      book1.displayInfo();
      book2.displayInfo();
   }
 }