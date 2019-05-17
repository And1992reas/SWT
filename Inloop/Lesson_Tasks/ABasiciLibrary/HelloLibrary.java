import com.sun.java_cup.internal.runtime.virtual_parse_stack;

class HelloLibrary
{

    public static void main(String [] args)
    {
        Book book1 = new Book("Java for Dummies");
        Book book2= new Book("Java for Dummies");
        Book book3 = new Book("Java for Dummies");
        Book book4 = new Book("Java for Dummies");
        Book book5 = new Book("Java for Dummies");
        Book book6 = new Book("Java for Dummies");
        Book book7 = new Book("Java for Dummies");
        Book book8 = new Book("Java for Dummies");
        Book book9 = new Book("Java for Dummies");
        Book book10 = new Book("haha");
        Book book11 = new Book("Java for Dummies");
       

        //System.out.println(book1);
        Library library = new Library();
        System.out.println(book1);
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        library.add(book6);
        library.add(book7);
        library.add(book8);
        library.add(book9);
        library.add(book10);
        library.add(book11);
       

        library.search("Java for Dummies");
        library.search("haa");
    }

  
}