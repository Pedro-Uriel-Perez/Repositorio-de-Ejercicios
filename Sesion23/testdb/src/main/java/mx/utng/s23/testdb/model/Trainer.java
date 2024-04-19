package mx.utng.s23.testdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    

    private long id;
    @Column(nullable = false, length = 50)
    private String name;


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
