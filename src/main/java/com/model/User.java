package com.model;


import javax.persistence.*;


@Entity
@Table(name = "user")
public class User {
    @Id
    private int id;
    private String name;
    private PhoneBook phoneBook;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "phonebook_id", referencedColumnName = "id")


    public PhoneBook getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }


    @Override
    public String toString() {
        return "User[" +
                "id=" + id +
                ", name='" + name + ']';
    }
}
