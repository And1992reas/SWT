class Library
{
    int i = 0;
    Book []library1 = new Book[10];
    
    
    
    public Library()
    {
        
        System.out.println("Hello, I am a library, which can store up to 10 books!");
        
    }
    public void add(Book book)
    {
        

        if(i<library1.length)
        { 
            library1[i]=book;
            
            System.out.println("I added the book " + book + "!");
            i++;
        }
        else
        {
            System.out.println("The library is full!");
        }
    }

    public Book search(String title)
    {    
        int number = 0;

         for (number=0;number<library1.length;number++)
        { 
            if (library1[number] !=null)
            { 
                if (library1[number].getTitle().equals(title))
                {
                    System.out.println("The book with the title " + title + " exists in the library!");
                    return library1[number];
                }
            }
        
        }

        System.out.println("The book with the title " + title+ " does not exist in the library!");
        
        return null;
    }
}