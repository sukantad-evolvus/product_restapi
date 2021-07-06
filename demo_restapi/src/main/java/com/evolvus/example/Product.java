package com.evolvus.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
@Id
@Column
private Long id;
@Column
private String name;
@Column
private Long price;

 private Product() {
	 
 }

public Product(Long id, String name, Long price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getPrice() {
	return price;
}

public void setPrice(Long price) {
	this.price = price;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}
	
	

}
