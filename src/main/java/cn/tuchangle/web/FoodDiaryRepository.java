package cn.tuchangle.web;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public interface FoodDiaryRepository extends CrudRepository<FoodDiary, Integer> {

  List<FoodDiary> findByDate(@Param("date") @DateTimeFormat(iso = ISO.DATE_TIME) Date date);

}
