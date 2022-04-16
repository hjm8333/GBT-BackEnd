package ksafinalproject.gbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class GbtApplication {

	public static void main(String[] args) {
		SpringApplication.run(GbtApplication.class, args);
		
//		LocalDate now = LocalDate.now();
//		System.out.println(now.getDayOfWeek());
//		System.out.println(now.get(WeekFields.ISO.weekOfMonth()));
//		System.out.println(now.get(WeekFields.ISO.dayOfWeek()));
//		System.out.println(now.get(WeekFields.ISO.weekOfWeekBasedYear()));
//		System.out.println(now.get(WeekFields.ISO.weekOfYear()));
	}
}
