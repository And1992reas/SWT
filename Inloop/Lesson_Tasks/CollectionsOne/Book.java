class Book implements Comparable <Book>
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
        return  isbn;
    }

    public String getAuthor()
    {
        if(this.author==null)
        {
            return "";
        }

        return author;
    }

    public String getTitle()
    {
        if(this.title==null)
        {
            return "";
        }
        return title;
    }

    @Override
    public String toString()
    {
        return isbn;
    }

    @Override
    public int compareTo(Book b)
    {
        if(this.isbn == b.getIsbn())
        {
            return 0;
        }
        else if(Integer.parseInt(this.isbn)>Integer.parseInt(b.getIsbn()))
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

}   


