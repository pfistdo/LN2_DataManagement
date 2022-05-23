package ch.zhaw.infm.springboottemplate.restcontroller;

import ch.zhaw.infm.springboottemplate.entities.Address;
import ch.zhaw.infm.springboottemplate.entities.Person;
import ch.zhaw.infm.springboottemplate.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonRestController {

    @Autowired
    PersonRepository repository;

    @RequestMapping(value = "persons/persons", method = RequestMethod.GET)
    public ResponseEntity<List<Person>> getPersons() {
        List<Person> result = repository.findAll();
        if (!result.isEmpty()) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "persons/{personId}", method = RequestMethod.GET)
    public ResponseEntity<Person> getPersonById(@PathVariable("personId") long personId) {
        Optional<Person> result = repository.findById(personId);
        if (result.isPresent()) {
            return new ResponseEntity<Person>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
        }
    }
}
