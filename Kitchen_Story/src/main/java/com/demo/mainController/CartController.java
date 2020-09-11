package com.demo.mainController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.Cart;
import com.demo.main.Service.CartService;

@RestController
public class CartController{
	@Autowired
	public CartService cartservice;
	@PostMapping("/cart")
	public Cart addCart(@RequestBody Cart cart) {
		return cartservice.addCart(cart);
	}
	@DeleteMapping("/cart/{id}")
	public void deleteCartByid(@PathVariable int id) {
		
		cartservice.deleteCartByid(id);
	}
@GetMapping("/cart")
	public List<Cart> getCarts() {
		
		return cartservice.getCarts();
	}

}