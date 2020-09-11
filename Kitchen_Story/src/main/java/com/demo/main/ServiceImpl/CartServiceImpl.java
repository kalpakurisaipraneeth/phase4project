package com.demo.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.Cart;
import com.demo.main.Dao.CartDao;
import com.demo.main.Service.CartService;
@Service
public class CartServiceImpl implements CartService{
	@Autowired
private CartDao dao;

	@Override
	public List<Cart> getCarts() {

		return dao.findAll();
	}

	@Override
	public Cart addCart(Cart cart) {
		
		return dao.save(cart);
	}

	@Override
	public void deleteCartByid(int id) {
		dao.deleteById(id);
		
	}



}
