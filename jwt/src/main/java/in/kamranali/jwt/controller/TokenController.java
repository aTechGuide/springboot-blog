package in.kamranali.jwt.controller;

import in.kamranali.jwt.model.JwtUser;
import in.kamranali.jwt.security.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bornshrewd on 11/12/17
 */
@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    private JwtGenerator jwtGenerator;

    @PostMapping
    String generateToken(@RequestBody final JwtUser jwtUser){

        return jwtGenerator.generate(jwtUser);
    }
}
