package Group_id.Design_Patterns;

class SingleObject_Class
{
	public static SingleObject_Class instance=new SingleObject_Class();
	private SingleObject_Class() {}
	public static SingleObject_Class getInstance()
	{
		return instance;
	}
	public void show()
	{
		System.out.println("This class has a single instance with the variable name:\"instance\".\nThe SINGLE TON PATTERN  is achieved through \"private Constructor\" here.");
	}
}
public class CREATIONAL_singleTonPattern 
{
	public static void main(String args[])
	{
		SingleObject_Class single_object=SingleObject_Class.getInstance();
		single_object.show();
	}
}
