package br.com.uol.poc.graphql.service;

import br.com.uol.poc.graphql.model.Person;
import br.com.uol.poc.graphql.repository.PersonRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service public class PersonService {

	private final PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public List<Person> findAll() {
		return personRepository.findAll();
	}
}
