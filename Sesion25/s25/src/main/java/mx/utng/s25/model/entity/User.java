package mx.utng.s25.model.entity;

import javax.xml.crypto.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class User {

    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    @Column(length = 100, nullable = false)
    @NotEmpty
    @Email
    private String email;


    @NotEmpty
    @Column(length = 40, nullable = false)
    private String password;

    @Temporal(TemporalType.DATE)
    private Data recordAt;


    public void prePersist(){
        recordAt = new Date();
    }
    

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setRecordAt(Data recordAt) {
        this.recordAt = recordAt;
    }

    public Data getRecordAt() {
        return recordAt;
    }


}
