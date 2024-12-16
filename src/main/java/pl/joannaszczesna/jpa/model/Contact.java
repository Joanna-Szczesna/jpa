package pl.joannaszczesna.jpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CONTACT")
class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PRIVATE_PHONE_NUMBER", length = 11)
    private long privatePhoneNumber;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Address residenceAddress;
}
