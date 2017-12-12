package in.kamranali.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bornshrewd on 10/12/17
 */
@RestController
@RequestMapping("/rest/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hey YO !!";
    }
}
