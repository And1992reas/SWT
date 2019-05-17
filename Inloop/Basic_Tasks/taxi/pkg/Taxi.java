import java.util.*;
class Taxi
{
    private Human driver;
    int i = 0;

    Human []passengers= new Human[4];
    

    public Taxi(Human driver)
    {
        this.driver = driver;
        
    }

    public String getDriverName()
    {
        return driver.getForename() + " " + driver.getName();
    } 

    public void add(Human x)
    { 
        if (i<4)
        {
            passengers[i]= x;
            i++;
           System.out.println(x.getForename() + " " + x.getName()+ " gets in.") ;
        }
        
        else
        {
            System.out.println("We are sorry, " + x.getForename() + " " + x.getName() + ". The taxi is full.");
        }
       
    }

    public String toString()
    {
        
        if(i==0)
        {
        return "This is the taxi of " + driver + ". " + "He takes nobody along.";   
        }
        else if(i==1)
        {
         return "This is the taxi of " + driver + ". " + "He takes " + passengers[0] + " along.";   
        }
        else if(i==2)
        {
         return "This is the taxi of " + driver + ". " + "He takes " + passengers[0] + " and " +  passengers[1] + " along.";   
        }
        else if(i==3)
        {
         return "This is the taxi of " + driver + ". " + "He takes " + passengers[0]+ ", " + passengers[1] + " and "+ passengers[2] + " along.";   
        }
        else if (i==4)
        {
         return "This is the taxi of " + driver + ". " + "He takes " + passengers[0]+ ", "+ passengers[1]+ ", " + passengers[2]+ " and "+ passengers[3] + " along.";   
        }

        else
        {
            return null;
        }
       

    }

    public Human[] allGetOut()
    {
        int countPassengers = 0;
        
        for(int i = 0; i < passengers.length; i++)
        {
            if(passengers[i]!=null)
            {
                countPassengers++;
            }
        }
        Human []passengersOut = new Human[countPassengers];
        for(int i = 0; i < countPassengers; i++)
        {
            if(passengers[i]!=null)
            {
                passengersOut[i] = passengers[i];
            }
        }
        for(int i=0; i < countPassengers; i++)
        {
            passengers[i]= null;
        }
        this.i=0;
        return passengersOut;
    }
}



