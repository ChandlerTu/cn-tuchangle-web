package cn.tuchangle.web;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	@Autowired
	private FoodDiaryRepository repository;

	@Override
	public void run(String... strings) throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		int zoneOffset = calendar.get(Calendar.ZONE_OFFSET);
		int utc800 = 8 * 60 * 60 * 1000;
		calendar.add(Calendar.MILLISECOND, zoneOffset - utc800);
		Date date = calendar.getTime();

		FoodDiary foodDiary1 = new FoodDiary();
		foodDiary1.setFood("苹果");
		foodDiary1.setGram(100);
		foodDiary1.setDate(date);
		this.repository.save(foodDiary1);

		FoodDiary foodDiary2 = new FoodDiary();
		foodDiary2.setFood("香蕉");
		foodDiary2.setGram(200);
		foodDiary2.setDate(date);
		this.repository.save(foodDiary2);

		FoodDiary foodDiary3 = new FoodDiary();
		foodDiary3.setFood("葡萄");
		foodDiary3.setGram(300);
		foodDiary3.setDate(date);
		this.repository.save(foodDiary3);
	}

}
