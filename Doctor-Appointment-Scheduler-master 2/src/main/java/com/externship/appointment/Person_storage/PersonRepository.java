package com.externship.appointment.Person_storage;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, String> {
    Optional<Person> findByEmail(String email);
}
