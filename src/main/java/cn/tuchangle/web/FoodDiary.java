package cn.tuchangle.web;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FoodDiary {

  @Temporal(TemporalType.DATE)
  private Date date;

  private String food;

  private Integer gram;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

}
