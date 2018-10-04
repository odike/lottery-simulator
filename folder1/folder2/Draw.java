package folder1.folder2;
import java.util.ArrayList;

public abstract class Draw extends VehicleFile implements DealershipInterface,CustomerInterface
{
	public abstract int draw(DealershipType dtp)throws CarLotteryException;
	
	public ArrayList<Vehicle> ReadVehicle()
	{
		VehicleFile vf=new VehicleFile();
		ArrayList<Vehicle> veh=new ArrayList<Vehicle> ();
		vf.ReadVehicle();
		return veh;
	}
	
	public ArrayList<Dealership> ReadDealership()
	{
		DealershipImpl dim=new DealershipImpl();
		ArrayList<Dealership> deal=new ArrayList<Dealership>();
		dim.ReadDealership();
		return deal;
	}
	
	public ArrayList<Customer> ReadCustomer()
	{
		CustomerImpl c=new CustomerImpl();
		ArrayList<Customer> cust=new ArrayList<Customer>();
		c.ReadCustomer();
		return cust;
	}
}