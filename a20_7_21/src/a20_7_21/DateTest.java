package a20_7_21;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date Today = new Date();
		System.out.println(Today);

		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		System.out.println(dateForm.format(Today));

		Calendar now = Calendar.getInstance(); // new ����
		int Year, Month, Day, Hour, Minute, Second;
		Year = now.get(Calendar.YEAR);
		Month = now.get(Calendar.MONTH) + 1;// ���� 0�� ���� ����
		Day = now.get(Calendar.DATE);
		Hour = now.get(Calendar.HOUR);
		Minute = now.get(Calendar.MINUTE);
		Second = now.get(Calendar.SECOND);
		System.out.println(Year + "�� " + Month + "�� " + Day + "�� " + Hour + "�� " + Minute + "�� " + Second + "��");
	}
}
