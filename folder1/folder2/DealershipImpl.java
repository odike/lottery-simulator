package folder1.folder2;
import java.util.ArrayList;

public class DealershipImpl extends DealershipFile implements DealershipInterface 
{
	public ArrayList<Dealership> ReadDealership()
	{
		ArrayList<Dealership> deal=new ArrayList<Dealership>();
		super.ReadDealership();
		return deal;
		
	}
	
}