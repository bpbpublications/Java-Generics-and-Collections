package com.meennu.javabook.chap3;

import java.util.Set;

public class UpperBoundedWildcardSetExample {
	public static void printAnimalSounds(Set<? extends Animal> upperBoundedSet) {
		for (Animal animal : upperBoundedSet) {
			animal.animalSound();
		}
	}
}

class Animal {
	void animalSound() {
		System.out.println("Some general animal sound");
	}
}

class Dog extends Animal {
	@Override
	void animalSound() {
		System.out.println("Bark");
	}
}
