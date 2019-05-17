class Book{
    String title;
    public Book(String title)
    {
        this.title = title;
        System.out.println("Book " + title + " created.");
       
    }

    public String getTitle()
    {
        return this.title;
    }

    public String toString()
    {
        return title;

    }
}