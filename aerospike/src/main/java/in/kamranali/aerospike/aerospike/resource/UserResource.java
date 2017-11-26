package in.kamranali.aerospike.aerospike.resource;

import in.kamranali.aerospike.aerospike.model.User;
import in.kamranali.aerospike.aerospike.repositories.UserRepository;
import in.kamranali.aerospike.aerospike.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bornshrewd on 26/11/17
 */
@RestController
@RequestMapping("/rest/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }

    @PostMapping
    public List<User> create(@RequestBody final User user){

        userService.create(user);
        return userService.getAllUsers();
    }
}
