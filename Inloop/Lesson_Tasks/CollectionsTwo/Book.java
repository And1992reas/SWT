public class Book implements Comparable<Book>
{
    private String isbn;
    private String author;
    private String title;

    public Book(String isbn, String author, String title)
    {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    public Book(String isbn)
    {
        this.isbn = isbn;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getAuthor()
    {
        if(author==null)
        {
            return "";
        }
        return author;
    }

    public String getTitle()
    {
        if(title==null)
        {
            return "";
        }
        return title;
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    public int compareTo(Book b)
    {
        return isbn.compareTo(b.getIsbn());
    }

}