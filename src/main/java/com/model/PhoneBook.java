package com.model;


import javax.persistence.*;


@Entity
@Table(name = "phonebook")
public class PhoneBook {
    @Id
    private int id;
    private String surname;
    private String phoneNumber;
    private User user;

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
    @Column(name = "surname", nullable = false, length = 100)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "phonenumber", nullable = false, length = 100)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @OneToOne(mappedBy = "phonebook")

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this. user =  user;
    }




    @Override
    public String toString() {
        return "PhoneBook[" +
                "id=" + id +
                ", surname=" + surname +
                ", phonenumber=" + phoneNumber + ']';
    }
}
