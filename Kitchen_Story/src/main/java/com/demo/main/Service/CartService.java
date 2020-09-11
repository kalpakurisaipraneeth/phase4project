package com.demo.main.Service;

import java.util.List;

import com.demo.main.Cart;

public interface CartService {
     
	 public Cart addCart(Cart cart);
	 public void deleteCartByid(int id);
	 public List<Cart>  getCarts();
	 
	 
	 
}
