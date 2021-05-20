package br.com.uol.poc.graphql.resolver;

import br.com.uol.poc.graphql.model.Person;
import br.com.uol.poc.graphql.service.PersonService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.List;
import org.springframework.stereotype.Component;

@Component public class PersonResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

	private final PersonService personService;

	public PersonResolver(PersonService personService) {
		this.personService = personService;
	}

	public List<Person> findAllPerson() {
		return personService.findAll();
	}
}
