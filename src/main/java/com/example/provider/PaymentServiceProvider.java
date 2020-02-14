package com.example.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumer.CartServiceConsumer;
import com.example.model.Cart;

@RestController
@RequestMapping("payment-provider")
public class PaymentServiceProvider {

	@Autowired
	CartServiceConsumer cartServiceConsumer;

	@GetMapping("/info")
	public String getInfo() {
		return cartServiceConsumer.getMsg();
	}

	@GetMapping("/one")
	public Cart getOneRow() {
		return cartServiceConsumer.getObj();
	}

	@GetMapping("/bulk")
	public List<Cart> getBulkRows() {
		return cartServiceConsumer.getBulk();
	}
}
