package com.ykb.training.dp.creational.builder;

public class Person {
	private String name;
	private String surname;
	private int yas;
	
	private Person() {
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getYas() {
		return yas;
	}
	
	public static PersonBuilder getBuilder() {
		return new PersonBuilder();
	}

	public static class PersonBuilder {
		private Person person = new Person();
		
		private PersonBuilder() {
		}
		
		public PersonBuilder withName(String name) {
			person.name = name;
			return this;
		}
		
		public PersonBuilder withSurname(String surname) {
			person.surname = surname;
			return this;
		}
		public PersonBuilder withYas(int age) {
			person.yas = age;
			return this;
		}
		public Person build() {
			// Validations
			return person;
		}

	}
	
}
