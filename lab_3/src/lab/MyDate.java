package lab;

public class MyDate {
int year,month,day;

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

@Override
public String toString() {
	return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
}

}
