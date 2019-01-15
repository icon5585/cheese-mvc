package org.launchcode.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Note: this is poor form and not real!
public class CheeseData {
	static List<Cheese> cheeses = new ArrayList<>();

	public static List<Cheese> getAll() {
		return cheeses;
	}

	public static void add(Cheese cheese) {
		cheeses.add(cheese);
	}

	public static Cheese getById(int cheeseId) {
		// Java 8 streams and optionals!
		Optional<Cheese> foundCheeseOptional = cheeses.stream().filter(c -> c.getCheeseId() == cheeseId).findFirst();

		if (foundCheeseOptional.isPresent()) {
			return foundCheeseOptional.get();
		}

		return null;
	}

	public static void remove(int cheeseId) {
		cheeses.remove(getById(cheeseId));
	}

}
