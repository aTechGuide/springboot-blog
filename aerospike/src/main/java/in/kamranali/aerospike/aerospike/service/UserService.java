package in.kamranali.aerospike.aerospike.service;

import in.kamranali.aerospike.aerospike.model.User;
import in.kamranali.aerospike.aerospike.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bornshrewd on 26/11/17
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){

        List<User> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);
        return users;
    }

    public void create(User user) {

        userRepository.save(user);
    }
}
