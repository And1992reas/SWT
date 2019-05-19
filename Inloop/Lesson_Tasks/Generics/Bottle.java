class Bottle<T>
{
    private T content;
    private boolean statusEmpty = true;
    public boolean isEmpty()
    {
        if(statusEmpty)
        {
            return true;
        }
            return false;
    }

    public void fill(T content)
    {
        if(statusEmpty!=true)
        {
            throw new IllegalStateException("Bottle already full.");
            
        }
        statusEmpty=false;

        this.content = content;

        return ;
    }

    public T empty()
    {
        if (statusEmpty)
        {
            throw new IllegalStateException("Bottle already empty");
        }

        statusEmpty = true;
       // content = null;

        return content;
    }



}