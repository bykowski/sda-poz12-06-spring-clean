package app2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2 {

    @GetMapping("/hello2")
    public String get() {
        return "Hello 2";
    }
}
