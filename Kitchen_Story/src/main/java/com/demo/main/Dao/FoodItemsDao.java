package com.demo.main.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.main.FoodItems;

public interface FoodItemsDao  extends JpaRepository<FoodItems, Integer>{
	public List<FoodItems> findByCategory(String category);
	public List<FoodItems> findByFood(String food);
}
