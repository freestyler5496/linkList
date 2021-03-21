public class LinkList {

	public int count;
	public node header;
	public node end;
    public nodeList() {
    	count=0;
    	header=null;
    	end=null;
    }
    public void addToTheEnd(node n)
    {
    	if(count==0)
    	{
    		header=n;
    	}
    	else
	    	end.next=n;
   		end=n;
   		count++;
    }
    public void insert(node n)
    {
    	if(count==0)
    	{
    		header=n;
    		end=n;
    	}
    	else{
	    	n.next=header;
    		header=n;
    	}
    	count++;
    }
    public String toString()
    {
    	String str="";
	    for(node t=header;t!=null;t=t.next)
   			str+=t;
   		return str;
   	}
    public void remove()
    {
    	header=header.next;
    	count--;
    }

}
