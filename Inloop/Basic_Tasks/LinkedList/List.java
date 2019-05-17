class List
{
    private ListElement head;
    
    public List(ListElement head)
    {
		this.head = head;
    }
    
    public List()
    {

    }

    public void append(String content)
    {
        if (content.isEmpty())
        {
            throw new IllegalArgumentException("The argument 'content' cannot be empty!");
        }
        ListElement current = head;
        if(current == null)
        {
            head = new ListElement(content);   
            return;
        }
        else
        {
            /*current=current.getNext();
            while(current!=null)
            {
                current=current.getNext();
            }
            current = new ListElement(content);*/
            while(current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new ListElement(content));
        }
    }

    public String remove(String content)
    {
        if(head==null)
        {
            return null;
        }
        ListElement current = head;

        if(current.getContent()==content)
        {
            String removedElement=head.getContent();
            current = current.getNext();
            //current.setNext(current.getNext());
            head = current;
            return removedElement;
        }
        
        while(current.getNext()!=null)
        {
            if(current.getNext().getContent()==content)
            {
                String removedElement=current.getNext().getContent();
                current.setNext(current.getNext().getNext());
                return removedElement;
            }
            else
            {
                current = current.getNext();  
            }
        }
        return null;
    }
}