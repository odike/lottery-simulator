package folder1.folder2;
import java.io.Serializable;
public class Winner implements Serializable

{
	static int ID;
	int currentID;
	int time;
	int customerID;
	String dealer;
	int event;

	public Winner(){
	ID++;
	currentID=ID;
	time=0;
	customerID=0;
	dealer=" ";
	event=0;
	}

	public Winner(int tim,int cus,String dl, int e)
	{
	time=tim;
	customerID=cus;
	dealer=dl;
	event=e;
	ID++;
	currentID=ID;
	}

	public int getCurrentID()
	{
		return currentID;
	}
	public int getEvent()
	{
		return event;
	}
	public int getTime()
	{
		return time;
	}
	public int getCustomerID()
	{
		return customerID;
	}
	public String getDealer()
	{
		return dealer;
	}

	
	public String toString(){
		String out="The car number is : "+currentID+", and the event number is : "+event+", the time it was awarded was: "+time+", and the customer ID is : "+customerID+", and the dealership name is : "+dealer;
		return out;
	}
}
