package in.kamranali.aerospike.aerospike.model;

import org.luaj.vm2.ast.Str;
import org.springframework.data.annotation.Id;

/**
 * Created by bornshrewd on 26/11/17
 */
public class User {

    @Id
    private Integer id;
    private String name;
    private Long salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
