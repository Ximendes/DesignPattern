package com.design_pattern.observer_internet_example;

public interface Subject {

	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}
