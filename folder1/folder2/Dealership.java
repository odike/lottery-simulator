package folder1.folder2;
import java.io.Serializable;

public class Dealership implements Serializable
{
	String dealer_name;
	DealershipType dt;
	static int ID;
	int currentID;
	
	public Dealership()
	{
		dealer_name=" ";
		dt=null;
		ID++;
		currentID=ID;
	}
	
	public Dealership(String nm,DealershipType dte)
	{
		dealer_name=nm;
		dt=dte;
		ID++;
		currentID=ID;
	}
	
	public String getDealerName()
	{
		return dealer_name;
	}
	
	public void setDealerName(String dnm)
	{
		dealer_name=dnm;
	}
	
	public DealershipType getDealershipType()
	{
		return dt;
	}
	
	public void setDealersipType(DealershipType dte)
	{
		dt=dte;
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
		String out="The dealership name is:"+" "+dealer_name+"\n"+
				   "The dealer type is"+" "+dt;
		return out;
	}
}