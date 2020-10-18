package com.design_pattern.observer_internet_example;

import java.util.ArrayList;

public class Loan implements Subject {

	private ArrayList<Observer> observers;
	private String type;
	private float interest;
	private String bank;

	public Loan(String type, float interest, String bank) {
		this.type = type;
		this.interest = interest;
		this.bank = bank;
		this.observers = new ArrayList<Observer>();
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
		notifyObservers();
	}

	public String getBank() {
		return this.bank;
	}

	public String getType() {
		return this.type;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(ob -> {
			System.out.println("Notificando observadores sobre a mudança na taxa de juros do empréstimo");
			ob.update(this.interest);
		});
	}
}
