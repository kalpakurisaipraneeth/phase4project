package com.demo.mainController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.FoodItems;
import com.demo.main.Service.FoodItemsService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class FoodItemsController{
@Autowired
private FoodItemsService fooditems;
	
	@PostMapping("/foodItems")
	public FoodItems addFoodItems(@RequestBody FoodItems food) {
		
		return fooditems.addFoodItems(food);
	}

	@PutMapping("/foodItems")
	public FoodItems updateFoodItems(@RequestBody FoodItems food) {
		
		return fooditems.updateFoodItems(food);
	}

	@DeleteMapping("/foodItems")
	public void deleteFoodItems(@RequestBody FoodItems food) {
		
		fooditems.deleteFoodItems(food);
		
	}

	@GetMapping("/foodItems/{id}")
	public FoodItems getFoodItemsById(@PathVariable int id) {
		
		return fooditems.getFoodItemsById(id);
	}

	@GetMapping("/foodItems")
	public List<FoodItems> getAllFoodItems() {
		
		return fooditems.getAllFoodItems();
	}

@GetMapping("/foodItems/category/{category}")
	public List<FoodItems> getAllFoodItemsByCategory(@PathVariable String category) {
		
		return fooditems.getAllFoodItemsByCategory(category);
	}

@GetMapping("/foodItems/food/{food}")
public List<FoodItems> getAllFoodItemsByFood(@PathVariable  String food) {

	return fooditems.getAllFoodItemsByFood(food);
}
@DeleteMapping("/foodItems/{id}")
public void deleteFoodItemsById(@PathVariable int id) {
	fooditems.deleteFoodItemsById(id);
}


}
