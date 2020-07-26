package Group_id.Design_Patterns;

import java.util.Date;

class ChatRoom 
{
   public static void showMessage(User user, String message)
   {
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }
}
class User 
{
   private String name;
   public String getName() 
   {
      return name;
   }
   public void setName(String name) 
   {
      this.name = name;
   }
   public User(String name)
   {
      this.name  = name;
   }
   public void sendMessage(String message)
   {
      ChatRoom.showMessage(this,message);
   }
}
public class BEHAVIORAL_mediatorPattern
{
	public static void main(String[] args) 
	{
	      User robert = new User("Jyothi");
	      User john = new User("Chandu");

	      robert.sendMessage("Hi! Jyothi!");
	      john.sendMessage("Hello! Chandu!");
	   }
}
