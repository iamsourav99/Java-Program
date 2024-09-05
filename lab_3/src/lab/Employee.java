package lab;

import java.util.Date;

public class Employee extends Person {
String office;
double salary;
Date dateHired=new Date();
@Override
public String toString() {
	return "Employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + ", name=" + name + "]";
}

}
