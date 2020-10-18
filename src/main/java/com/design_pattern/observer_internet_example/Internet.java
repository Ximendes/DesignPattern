package com.design_pattern.observer_internet_example;

public class Internet implements Observer {
	@Override
	public void update(float interest) {
		System.out.println("Internet: Taxa de juros atualizada, nova taxa é: " + interest);
	}

}
