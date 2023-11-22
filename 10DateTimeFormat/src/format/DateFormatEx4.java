package format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);

		Date inDate = null;

		System.out.println("날짜를 " + pattern + "의 형태로 입력.(예: 2015/12/31)");

		while (s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("날짜를 " + pattern + "의 형태로 입력.(예: 2015/12/31)");
			}
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
		System.out.println("입력한 날짜는 현재와" + day + "시간 차이가 있다. ");
	}
}