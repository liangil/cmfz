package com.baizhi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfo implements Serializable {

  private String productId;
  private String productName;
  private double productPrice;
  private String productStock;
  private String productDescription;
  private String productIcon;
  private String categoryType;
  private Date createTime;
  private Date updateTime;

}
