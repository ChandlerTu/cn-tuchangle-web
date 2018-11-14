package cn.tuchangle.web;

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
    FoodDiary foodDiary1 = new FoodDiary();
    foodDiary1.setFood("苹果");
    foodDiary1.setGram(100);
    foodDiary1.setDate(new Date());
    this.repository.save(foodDiary1);

    FoodDiary foodDiary2 = new FoodDiary();
    foodDiary2.setFood("香蕉");
    foodDiary2.setGram(200);
    foodDiary2.setDate(new Date());
    this.repository.save(foodDiary2);

    FoodDiary foodDiary3 = new FoodDiary();
    foodDiary3.setFood("葡萄");
    foodDiary3.setGram(300);
    foodDiary3.setDate(new Date());
    this.repository.save(foodDiary3);
  }

}
