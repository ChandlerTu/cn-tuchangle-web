package cn.tuchangle.web;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

public interface FoodDiaryRepository extends CrudRepository<FoodDiary, Integer> {

  List<FoodDiary> findByDate(@Param("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date);

}
