abstract class Wine extends Drink 
{
    protected String region;

    public Wine(String region)
    {
        this.region = region;
    }

    public String getRegion()
    {
        return region;
    }

    public String toString()
   {
       return region;
   } 
}