package in.kamranali.aerospike.aerospike.repositories;

import in.kamranali.aerospike.aerospike.model.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;

/**
 * Created by bornshrewd on 26/11/17
 */
public interface UserRepository extends AerospikeRepository<User, Integer> {
}
