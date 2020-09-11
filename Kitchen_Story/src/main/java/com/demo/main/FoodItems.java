package com.demo.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
@Entity
@Table(name="FoodItems")
public class FoodItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="FoodItems")
	private String food;
	@Column(name="Rate")
	private int cost;
	@Column(name="Category")
	private String category;
	@Lob
	@Column(columnDefinition = "CLOB")
	private String Avatar;
	public FoodItems() {
		super();
	}
	
	public FoodItems( String food, int cost, String category, String avatar) {
		super();
		this.food =food;
		this.cost = cost;
		this.category = category;
		Avatar = avatar;
	}

	public String getAvatar() {
		return Avatar;
	}

	public void setAvatar(String avatar) {
		Avatar = avatar;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "FoodItems [id=" + id + ", food=" + food + ", cost=" + cost + ", category=" + category + ", Avatar="
				+ Avatar + "]";
	}

	
	
}
