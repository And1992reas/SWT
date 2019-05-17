import java.util.*;

class TestLeet
{
    public static void main (String[] args)
    {

        String test ="Yo soy un chico muy cool";
        test=Leet.toLeet(test);
        String[] testArray={"We are elite hackers","Informatiker machen coole Sachen"};
        testArray=Leet.allToLeet(testArray);
    
        for(int i = 0; i<testArray.length; i++)
        {
            System.out.println(testArray[i]);

        }
        
        System.out.println(test);

        

    }
}
