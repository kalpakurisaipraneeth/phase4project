 package com.demo.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.FoodItems;
import com.demo.main.Dao.FoodItemsDao;
import com.demo.main.Service.FoodItemsService;

@Service
public class FoodItemsServiceImpl implements FoodItemsService{
	@Autowired
	private FoodItemsDao dao;

	@Override
	public FoodItems addFoodItems(FoodItems food) {
		
		return dao.save(food);
	}

	@Override
	public FoodItems updateFoodItems(FoodItems food) {
		
		return dao.saveAndFlush(food);
	}

	@Override
	public FoodItems getFoodItemsById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public List<FoodItems> getAllFoodItems() {
		
		return dao.findAll();
	}

	@Override
	public List<FoodItems> getAllFoodItemsByCategory(String category) {
		
		return dao.findByCategory(category);
	}

	@Override
	public List<FoodItems> getAllFoodItemsByFood(String food) {
		
		return dao.findByFood(food);
	}

	@Override
	public void deleteFoodItems(FoodItems food) {
		dao.delete(food);
		
	}

	@Override
	public void deleteFoodItemsById(int id) {
		dao.deleteById(id);
		
	}



}
