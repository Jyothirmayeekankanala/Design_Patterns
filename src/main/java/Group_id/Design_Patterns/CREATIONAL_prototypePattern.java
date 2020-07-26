package Group_id.Design_Patterns;

import java.util.Map;
import java.util.HashMap;
abstract class car implements Cloneable
{
	protected String car_name;
	public abstract void add_car();
	public Object clone()
	{
		Object clone=null;
		try
		{
			clone=super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return clone;
	}
}
class suzuki_car extends car
{
	suzuki_car()
	{
		car_name="SUZUKI";
	}
	public void add_car()
	{
		System.out.println("Added SUZUKI car");
	}
}
class bmw_car extends car
{
	bmw_car()
	{
		car_name="BMW";
	}
	public void add_car()
	{
		System.out.println("Added BMW car");
	}
}
class toyota_car extends car
{
	toyota_car()
	{
		car_name="TOYOTA";
	}
	public void add_car()
	{
		System.out.println("Added TOYOTA car");
	}
}
class clone_car
{
	private static Map<String, car> car_map=new HashMap<String,car>();
	static
	{
		car_map.put("SUZUKI",new suzuki_car());
		car_map.put("TOYOTA",new toyota_car());
		car_map.put("BMW",new bmw_car());
	}
	public static car get_car(String car_name)
	{
		return (car) car_map.get(car_name).clone();
	}
}
public class CREATIONAL_prototypePattern 
{
	public static void main(String args[])
	{
		clone_car.get_car("SUZUKI").add_car();
		clone_car.get_car("TOYOTA").add_car();
		clone_car.get_car("BMW").add_car();
		clone_car.get_car("TOYOTA").add_car();
		clone_car.get_car("BMW").add_car();
		clone_car.get_car("SUZUKI").add_car();
		System.out.println("\nCar class is the prototype using which the suzuki_car, toyota_car, bmw_car are built.\nThe PROTOTYPE PATTERN is achieved through \"cloned Object\" here.");
	}
}
