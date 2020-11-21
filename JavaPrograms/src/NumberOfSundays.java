import java.util.Calendar;

public class NumberOfSundays {

	public static void main(String[] args) {
		Calendar startDate = Calendar.getInstance();
		startDate.set(2020, 10, 01);

		Calendar endDate = Calendar.getInstance();
		endDate.set(2020, 10, 30);

		int count = 0;

		while (startDate.before(endDate)) {
			if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				count++;
				startDate.add(Calendar.DATE, 7);
				//System.out.println(count);
			} else {
				startDate.add(Calendar.DATE, 1);
			}

		}
		
	
	
//System.out.println(count);
	//System.out.println(count);
	//System.out.println(count);
	System.out.println(count);
}
}
