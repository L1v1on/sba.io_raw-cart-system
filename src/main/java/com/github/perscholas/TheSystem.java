package com.github.perscholas;


import java.util.HashMap;

public abstract class TheSystem {
	private HashMap<String, Item> itemCollection;

	TheSystem() {
        itemCollection = new HashMap<String, Item>();
        // Your code here
	}

	public Boolean checkAvailability(Item item) {
		// Your code here
		return null;
	}
	
	public Boolean add(Item item) {
		// Your code here
		return null;
	}

	public Item remove(String itemName) {
		// Your code here
		return null;
	}

	public abstract void display();
}
