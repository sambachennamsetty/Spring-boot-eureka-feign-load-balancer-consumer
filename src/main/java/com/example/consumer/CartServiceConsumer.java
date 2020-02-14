package com.example.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Cart;

@FeignClient("CART-PROVIDER")
public interface CartServiceConsumer {

	@GetMapping("/cart-provider/info")
	public String getMsg();

	@GetMapping("/cart-provider/data")
	public Cart getObj();

	@GetMapping("/cart-provider/list")
	public List<Cart> getBulk();
}
