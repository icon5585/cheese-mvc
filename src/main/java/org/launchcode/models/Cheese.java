package org.launchcode.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cheese {

	private static final int MAX_SIZE = 15;
	
	@NotNull
	@Size(min = 3, max = MAX_SIZE, message = "Name must be between 3 and 15 characters")
	private String name;

	@NotNull
	@Size(min = 1, message = "Description must not be empty")
	private String description;

	private CheeseType type;

	private int cheeseId;
	private static int nextId = 1;

	public Cheese() {
		this.name = "";
		this.description = "";
		this.type = CheeseType.HARD;	// default to hard
		this.cheeseId = nextId;
		nextId++;
	}

	public Cheese(String name, String description) {
		this.name = name;
		this.description = description;
		this.cheeseId = nextId;
		nextId++; // Note: this would normally be handled by the DAO
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public int getCheeseId() {
		return cheeseId;
	}

	public CheeseType getType() {
		return type;
	}

	public void setType(CheeseType type) {
		this.type = type;
	}
}
