package org.hrb;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

// in java 8 ,new date time api have been added.
// It is present in java.time.* package.

public class DateTime {

	public static void main(String[] args) {
		
		// Only returns date
		LocalDate d = LocalDate.now();
		System.out.println("date : "+d);		// date : 2022-08-16
		
		// Only returns time - with or without zone
		LocalTime t = LocalTime.now();
//		LocalTime t = LocalTime.now(ZoneId.of("Indian/Maldives"));
		System.out.println("time : "+t); 			// time : 22:49:42.101835800

//		 can get all the available zone id's
//		 Indian/Maldives
		for(String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
		}
		
		// machine readable time
		Instant i = Instant.now();
//		System.out.println(i);    // 2022-08-16T17:19:42.104835Z
		
		
		// Date and Time
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("localDateTime : "+dt);	// localDateTime : 2022-08-16T22:51:54.338956300
		
	}

}
