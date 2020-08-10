package a20_7_21;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date Today = new Date();
		System.out.println(Today);

		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(dateForm.format(Today));

		Calendar now = Calendar.getInstance(); // new 없음
		int Year, Month, Day, Hour, Minute, Second;
		Year = now.get(Calendar.YEAR);
		Month = now.get(Calendar.MONTH) + 1;// 달이 0달 부터 시작
		Day = now.get(Calendar.DATE);
		Hour = now.get(Calendar.HOUR);
		Minute = now.get(Calendar.MINUTE);
		Second = now.get(Calendar.SECOND);
		System.out.println(Year + "년 " + Month + "월 " + Day + "일 " + Hour + "시 " + Minute + "분 " + Second + "초");
	}
}
