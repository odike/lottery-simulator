package folder1.folder2;
import java.io.Serializable;

public class Customer implements Serializable
{
	String first_name;
	String last_name;
	int lottery_num;
	CustomerType ct;
	static int ID;
	int currentID;
	Vehicle veh;
	public Customer()
	{
		first_name="any name";
		last_name="any name";
		lottery_num=0;
		ct=null;
		ID++;
		currentID=ID;
	}
	
	public Customer(String fn,String ln,int ltn)
	{
		first_name=fn;
		last_name=ln;
		lottery_num=ltn;
		ct=null;
		veh=null;
		ID++;
		currentID=ID;
	}
	
	public String getFirstName()
	{
		return first_name;
	}
	
	public void setFirstName(String fnam)
	{
		first_name=fnam;
	}
	
	public String getLastName()
	{
		return last_name;
	}
	
	public void setLastName(String lnam)
	{
		last_name=lnam;
	}
	
	public int getLotteryNumber()
	{
		return lottery_num;
	}
	
	public void setLotteryNumber(int lott)
	{
		lottery_num=lott;
	}
	
	public Vehicle getVehicle()
	{
		return veh;
	}
	
	public void setVehicle(Vehicle vehe)
	{
		veh=vehe;
	}
	
	public CustomerType getCustomerType()
	{
		return ct;
	}
	
	public void setCustomerType(CustomerType cte)
	{
		ct=cte;
	}
	
	public static int getID()
	{
		return ID;
	}
	
	public int getCurrentID()
	{
		return currentID;
	}
	
	public void setCurrentID(int cid)
	{
		currentID=cid;
	}
	
	public String toString()
	{
		String st="The first name is"+" "+first_name+"\n"+
				  "The last name is"+" "+last_name+"\n"+
				  "The lottery number is"+" "+lottery_num+"\n"+
				  "The category is"+" "+ct+"\n"+
				  "The ID is"+" "+currentID;
		return st;
	}
}