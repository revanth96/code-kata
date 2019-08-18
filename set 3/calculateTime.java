package set3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class calculateTime {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("enter time: eg: 12:00");
		String time1 = input.nextLine();
		String time2 = input.nextLine();

		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		long diff = date2.getTime() - date1.getTime();
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000);
		System.out.println(+diffHours + " " + diffMinutes);
	}
}
