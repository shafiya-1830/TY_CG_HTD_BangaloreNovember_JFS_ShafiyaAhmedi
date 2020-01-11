package com.capgemini.retailermaintanenceapi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="UserInfo")
public class UserInfo {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column(unique=true,nullable=false)
	private String email;
	@Column
	private String password;
//	@OneToMany(cascade=CascadeType.ALL,mappedBy="userInfo")
//	private List<ProductInfo> addProduct;
//	@OneToMany(cascade=CascadeType.ALL,mappedBy="userInfo")
//	private List<OrderInfo> addOrder;
	
}
