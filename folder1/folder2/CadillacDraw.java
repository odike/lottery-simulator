package folder1.folder2;
import java.util.Random;

public class CadillacDraw extends Draw
{
	public int draw(DealershipType dtp)throws CarLotteryException
	{
		int c=0;
		
		if(dtp.equals(DealershipType.CADILLAC))
		{
			Random r=new Random();
			double value=r.nextGaussian()*3+2;
			
			c=((int)value)+1;
			
			if(c<=0)
			{
				throw new CarLotteryException();
			}
		}
		
		else c=-1;
		
		return c;
	}
	
}