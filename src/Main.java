public class Main {

	public static String dayOfTheWeek(int year, int month, int day){
		
		String []vettore={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		if(month<3)
			{
				year--;
				month+=12;
			}
	    int K = year % 100;
	    int J = year / 100;
		return (vettore[(day+13*(month+1)/5+K+K/4+J/4+5*J)%7]);
	}
	
	public static void main(String[] args) {
		
		System.out.println(dayOfTheWeek(2017,10,30));
		System.out.println(dayOfTheWeek(2016,2,29));
		System.out.println(dayOfTheWeek(2016,2,28));
		System.out.println(dayOfTheWeek(29,4,12));
		System.out.println(dayOfTheWeek(570,11,30));
		System.out.println(dayOfTheWeek(1066,9,25));
		System.out.println(dayOfTheWeek(1776,7,4));
		System.out.println(dayOfTheWeek(1933,1,30));
		System.out.println(dayOfTheWeek(1956,3,6));
		System.out.println(dayOfTheWeek(2100,1,9));
		System.out.println(dayOfTheWeek(2202,12,15));
		System.out.println(dayOfTheWeek(7032,3,26));
		
	}
}
