package Team2.backend.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@OnDelete(action = OnDeleteAction.CASCADE)
public class Customer {
    @Id
    @SequenceGenerator(name = "sequenceAI", sequenceName = "autoincrement", allocationSize = 1, initialValue = 0)
    @GeneratedValue(generator = "sequenceAI", strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "serial")
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name= "organisation", nullable = false)
    private String organisation;
    @Column(name= "email", nullable = false)
    private String email;
    @Column(name= "password", nullable = false)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public Customer() {
    }
}
