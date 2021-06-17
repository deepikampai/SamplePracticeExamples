package com.java8Features.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "television", 10000));
		productList.add(new Product(2, "Boombox", 5000));
		productList.add(new Product(3, "car", 40000));
		productList.add(new Product(4, "game", 9000));
		
		Integer priceIdSum = productList.stream().collect(Collectors.summingInt(p ->p.getId()));
		System.out.println(priceIdSum);
		
		Double averagePrice = productList.stream().collect(Collectors.averagingDouble(p->p.getPrice()));
		System.out.println(averagePrice);
		
		Long count = productList.stream().collect(Collectors.counting());
		System.out.println(count);
	}

}
