package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Hello1 {

    @GetMapping("/hello1")
    public String get() {
        return "Hello 1";
    }

    @GetMapping("/getPersons")
    public List<Person> getPersons() {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Jan", 22));
        people.add(new Person("Karolina", 42));
        people.add(new Person("Sylwia", 23));
        return people;
    }
}
