package com.baizhi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory implements Serializable {
  private String categoryId;
  private String categoryName;
  private String categoryType;
  private Date createTime;
  private Date updateTime;
  private List<ProductInfo> list;
}
