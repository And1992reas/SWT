/*For Collections.sort the class that contains the objects in the data structure
* should implement comparable interface. That is a requirement
*
*/
import java.lang.Math;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Library
{
    private List <Book> stock;
    public Library()
    {
        stock = new ArrayList<Book>();
    }

    public void sortedInsertion(Book newBook)
    {
        if(stock.isEmpty())
        {
            stock.add(newBook);
            return;
        }

        int indexnumber = Collections.binarySearch(stock, newBook);
      
        indexnumber = Math.abs(indexnumber +1); 
        
        stock.add(indexnumber, newBook);
        return ;
    }

    public Book searchForIsbn(String isbn)
    {
        for(Book b:stock)
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
       List <Book> searchResult = new ArrayList<Book>(); 
        for(Book b: stock)
        {
            if(b.getAuthor()==author)
            {
                searchResult.add(b);
            }

        }
        return searchResult;
   } 
}