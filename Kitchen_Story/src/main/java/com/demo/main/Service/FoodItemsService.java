package com.demo.main.Service;

import java.util.List;

import com.demo.main.FoodItems;

public interface FoodItemsService {
	
	public FoodItems addFoodItems(FoodItems food);
	public FoodItems updateFoodItems(FoodItems food);

	public FoodItems getFoodItemsById(int id);
	public List<FoodItems> getAllFoodItems();
	public List<FoodItems> getAllFoodItemsByCategory(String category);
	public List<FoodItems> getAllFoodItemsByFood(String food);
	public void deleteFoodItems(FoodItems food);

	public void deleteFoodItemsById(int id);

	

}
