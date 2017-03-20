package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyuliya.hasan on 3/20/2017.
 */

@RestController
public class GreetingController {

    public static final String template = "Hello, %s!";

    @RequestMapping("/greeting")
    public Greeting getHelloWorld(@RequestParam(value="name", defaultValue = "World") String name){
        return new Greeting(String.format(template, name));
    }
}
