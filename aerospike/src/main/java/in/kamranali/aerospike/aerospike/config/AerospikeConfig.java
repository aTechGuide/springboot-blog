package in.kamranali.aerospike.aerospike.config;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.policy.ClientPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.core.AerospikeTemplate;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by bornshrewd on 26/11/17
 */
@Configuration
@EnableAerospikeRepositories(basePackages = "in.kamranali.aerospike.aerospike.repositories")
@EnableTransactionManagement
public class AerospikeConfig {

    @Bean
    AerospikeTemplate aerospikeTemplate(){
        return new AerospikeTemplate(aerospikeClient(), "test ");
    }

    @Bean
    AerospikeClient aerospikeClient() {

        ClientPolicy clientPolicy = new ClientPolicy();
        clientPolicy.failIfNotConnected = true;
        return new AerospikeClient(clientPolicy, "localhost", 3000);
    }
}
