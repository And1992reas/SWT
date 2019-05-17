class Functions
{
    public static void main(String[] args)
    { 
        System.out.println(factorial(6));
    }

    public static int factorial(int n)
    {   
        
        int i =1;
        int y = 1;
        
        
        for(i=1;i<=n;i++)
        {
            y = y*i;
        }
         
         return y;

    }
}