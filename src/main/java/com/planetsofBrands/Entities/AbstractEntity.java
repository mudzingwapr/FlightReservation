package com.planetsofBrands.Entities;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;
@Data
@MappedSuperclass
public abstract class AbstractEntity {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
}
