package folder1.folder2;
import java.util.Random;
public class BuickDraw extends Draw
{
	public int draw(DealershipType dtp)throws CarLotteryException
	{
		int b=0;
		if(dtp.equals(DealershipType.BUICK))
		{
			b=(int)(1+Math.random()*(41));
			
			if(b<=0)
			{
				throw new CarLotteryException();
			}
		}
		
		else b=-1;
		
		return b;
	}
}