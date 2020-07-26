package Group_id.Design_Patterns;

interface my_Container 
{
	   public my_Iterator getIterator();
}

interface my_Iterator 
{
	   public boolean hasNext();
	   public Object next();
	}
class NamesRep implements my_Container 
{
	   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

	   @Override
	   public my_Iterator getIterator()
	   {
	      return new NameIterator();
	   }

	   private class NameIterator implements my_Iterator 
	   {

	      int index;

	      @Override
	      public boolean hasNext() 
	      {
	      
	         if(index < names.length)
	         {
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() 
	      {
	      
	         if(this.hasNext())
	         {
	            return names[index++];
	         }
	         return null;
	      }		
	   }
	}
public class BEHAVIORAL_iteratorPattern 
{
	public static void main(String[] args) 
	{
	      NamesRep names = new NamesRep();

	      for(my_Iterator iter = names.getIterator(); iter.hasNext();)
	      {
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
}
