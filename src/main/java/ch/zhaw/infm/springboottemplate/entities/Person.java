package ch.zhaw.infm.springboottemplate.entities;

import javax.persistence.*;

@Entity
public class Person extends TemporalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryId;

    private String surname;
    private String firstname;

    @ManyToOne
    private Address address;

    public Person(long categoryId, String surname, String firstname, Address address) {
        this.categoryId = categoryId;
        this.surname = surname;
        this.firstname = firstname;
        this.address = address;
    }

    public Person() {
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
