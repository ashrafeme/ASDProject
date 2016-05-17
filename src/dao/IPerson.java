package dao;

import java.util.List;

import model.Person;

public interface IPerson {
	public Person getPerson(Person pesron);

	public Person registerPerson(Person person);

	public List<Person> getPersons();

	public boolean deletePesron();
}
