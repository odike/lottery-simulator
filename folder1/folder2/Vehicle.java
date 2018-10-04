package folder1.folder2;
import java.io.Serializable;

public class Vehicle implements Serializable
{
	VehicleType vt;
	double acceleration;
	double velocity;
	double distance;
	int time;
	double initial_velocity;
	double initial_distance;
	double price;
	String dnm;
	static int id;
	int currentID=id;
	
	public Vehicle()
	{
		id++;
		currentID=id;
		vt=null;
		acceleration=0.0;
		velocity=0.0;
		distance=0.0;
		time=0;
		initial_velocity=0.0;
		initial_distance=0.0;
		price=0.0;
	}
	
	public Vehicle(VehicleType vte,double acc,int tm,double init_v,double init_d)
	{
		id++;
		currentID=id;
		vt=vte;
		acceleration=acc;
		time=tm;
		initial_velocity=init_v;
		initial_distance=init_d;
	}

	public VehicleType getVehicleType()
	{
		return vt;
	}

	public void setVt(VehicleType vte) 
	{
		vt = vte;
	}

	public double getAcceleration() 
	{
		return acceleration;
	}

	public void setAcceleration(double acc) 
	{
		acceleration = acc;
	}

	public double getVelocity() 
	{
		return velocity;
	}

	public void setVelocity(double vel)
	{
		velocity = vel;
	}

	public double getDistance() 
	{
		return distance;
	}

	public void setDistance(double dist) 
	{
		distance = dist;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double pr)
	{
		price=pr;
	}

	public int getTime() 
	{
		return time;
	}

	public void setTime(int tme) 
	{
		time = tme;
	}

	public double getInitial_velocity() 
	{
		return initial_velocity;
	}

	public void setInitial_velocity(double initial_v) 
	{
		initial_velocity = initial_v;
	}

	public double getInitial_distance() 
	{
		return initial_distance;
	}

	public void setInitial_distance(double initial_d)
	{
		initial_distance = initial_d;
	}
	
	public String getDNM()
	{
		return dnm;
	}
	
	public void setDNM(String dnam)
	{
		dnm=dnam;
	}
	
	public static int getID()
	{
		return id;
	}
	
	public void setID(int ident)
	{
		id=ident;
	}
	
	public int getCurrentID()
	{
		return currentID;
	}
	
	public void setCurrentID(int cid)
	{
		currentID=cid;
	}

	

	public boolean equals(Vehicle veh)
	{
		if(this.getCurrentID()==veh.getCurrentID())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void Price(Vehicle veh)
	{
		if(veh.getDNM().equals("Glen Ellyn Chevrolet"))
			veh.setPrice(16000);
		else if(veh.getDNM().equals("South Suburbs Pontiac"))
			veh.setPrice(19000);
		else if(veh.getDNM().equals("Chicago Buick"))
			veh.setPrice(20000);
		else if(veh.getDNM().equals("Schaumburg Cadillac"))
			veh.setPrice(35000);
		else if(veh.getDNM().equals("Saturn of North Chicago"))
			veh.setPrice(23000);
	}
	
	public String toString() 
	{
		return "Vehicle vt=" + vt +"\n"+"acceleration=" + acceleration+"\n"
				+ "velocity=" + velocity +"\n"+ "distance=" + distance+"\n"
				+ "time=" + time +"\n"+ "initial_velocity=" + initial_velocity+"\n"
				+ "initial_distance=" + initial_distance +"\n"+ "currentID="
				+ currentID + " ";
	}
	
}
