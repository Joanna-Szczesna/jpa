package pl.joannaszczesna.jpa.model;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "USER")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

    @Column(name="NAME", length=50, nullable=false)
    private String name;
    @Column(name="SURNAME", length=50, nullable=false)
    private String surname;

    @Column(name="BIRTH_DATE")
    private Date birthDate;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Contact contact;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
