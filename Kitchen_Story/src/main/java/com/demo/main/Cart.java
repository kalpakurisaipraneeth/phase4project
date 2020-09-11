package com.demo.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@ManyToOne(fetch = FetchType.EAGER)
	private FoodItems fooditems;
	private int quantity;
	public Cart() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public FoodItems getFooditems() {
		return fooditems;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Cart(FoodItems fooditems, int quantity) {
		super();
		this.fooditems = fooditems;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", fooditems=" + fooditems + ", quantity=" + quantity + "]";
	}


}
