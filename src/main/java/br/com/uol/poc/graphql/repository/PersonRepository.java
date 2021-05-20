package br.com.uol.poc.graphql.repository;

import br.com.uol.poc.graphql.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
