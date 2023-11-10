package com.studentmanagement.studentms.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {



    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Last_name",nullable = false)
    private String last_name;
    @Column(name="First_name",nullable = false)
    private String first_name;
    @Column(name="Email",nullable = false)
    private String email;

    public void setId(Long id) {
        this.id = id;
    }



    public Long getId() {

    return id;
    }


}
