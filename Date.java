class Date
{
	public static void main(String args[])
	{
		int dd=Integer.parseInt(args[0]);
		int mm=Integer.parseInt(args[1]);
		int yy=Integer.parseInt(args[2]);
		int m_day[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		int day_passed=dd;
		for(int i=0;i<mm;i++)
		{
			day_passed=day_passed+m_day[i];
		}
		if(yy%4==0 && mm>2)
		{
			day_passed=day_passed+1;
		}
		yy=yy-1;
		int x=yy/400;
		int y=(yy%400)/100;
		
		int z=(yy%400)%100;
		int century=x*400+y*100;
		 
		int i;
		int odd_year,leap_year=0;
		for( i=century+1;i<=yy;i++)
		{
			if(i%4==0 && i%100!=0)
			{
				leap_year++;
			}
			else if(i%400==0 && i%100==0)
			{
				leap_year++;
			}
		}
		
		
			odd_year=z-leap_year;
			int t_days=day_passed+(y*5)+odd_year+(leap_year*2);
			int t_odddays=t_days%7;
			System.out.println("no of odd day are "+t_odddays);
		
		switch(t_odddays)
		{
			case 0:
			 	System.out.println("day is sunday");
				break;
			case 1:
				System.out.println("day is monday");
				break;
			case 2:
				System.out.println("day is tueday");
				break;
			case 3:
				System.out.println("day is wednesday");
				break;
			case 4:
				System.out.println("day is thurday");
				break;
			case 5:
				System.out.println("day is friday");
				break;
			case 6:
				System.out.println("day is saturday");
				break;
		}

			
	}
}
