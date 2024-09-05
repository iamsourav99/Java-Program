package lab_week_7;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetExample {

	public static void main(String[] args) {
		Set<days> set=EnumSet.of(days.TUESDAY,days.WEDNESDAY);
		Iterator<days> ir=set.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
