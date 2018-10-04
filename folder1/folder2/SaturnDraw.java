package folder1.folder2;

import java.util.Random;

public class SaturnDraw extends Draw
{
	public int draw(DealershipType dtp)throws CarLotteryException
	{
		int s=0;
		
		if(dtp.equals(DealershipType.SATURN))
		{
			Random r=new Random();
			double value=r.nextGaussian()*4.5+40.5;
			s=(int)value;
			
			if(s<=0)
			{
				throw new CarLotteryException();
			}
		}
		
		else s=-1;
		
		return s;
	}
}