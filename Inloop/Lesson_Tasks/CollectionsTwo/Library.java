import java.util.*;
public class Library
{
    private Set<Book> stock;

    public Library()
    {
        stock = new TreeSet<Book>();

    }

    public boolean insertBook(Book newBook)
    {
        if(stock.contains(newBook))
        {
            return false;
        }

        stock.add(newBook);
        return true;
    }

    public Book searchForIsbn(String isbn)
    {
        if(stock.isEmpty())
        {
            return null;
        }

        for(Book b : stock)
        {
            if(b.getIsbn()==isbn)
            {
                return b;
            }
        }

        return null;
    }

    public List<Book> searchForAuthor(String author)
    {
        List<Book> authorsBibliography = new ArrayList<Book>();
        for(Book b : stock )
        {
            if(b.getAuthor()==author)
            {
                authorsBibliography.add(b);
            }
        }
        return authorsBibliography;
    }

    public Map<String, Set<Book>> listStockByAuthor() 
    {
        Map<String, Set<Book>> output = new HashMap<String, Set<Book>>();
        //Map to-be-returned declared. Takes up a String(author) as key and a Set of Books as value
        //Now iterate through the Set and chech every single book
        //if the map already contains the author of the book go to else
        //if not create a Set<Book> and add the book to it as a first element
        //then create a mapping of the author to the Set of books
        for(Book b : stock)
        {
            if(!(output.containsKey(b.getAuthor())))
            {
                Set<Book> bookSet =  new TreeSet<Book>();
                bookSet.add(b);
                output.put(b.getAuthor(),bookSet);
            }
            //Loop through bookSet, add book if not already in Set, 
            // otherwise do nothing
            //output.get(b.getAuthor()) returns bookSet 
                                                   
               
            if(!output.get(b.getAuthor()).contains(b))
            {
            output.get(b.getAuthor()).add(b);
            }   
        }
        return output;
    }
}