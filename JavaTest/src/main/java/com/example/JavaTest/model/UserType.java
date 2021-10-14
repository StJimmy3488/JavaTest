package com.example.JavaTest.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
<<<<<<< HEAD
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
=======

import javax.persistence.*;
>>>>>>> origin/master

@Table(name = "user_type")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotNull
    @Column(name = "user_type", nullable = false)
    private String userType;
<<<<<<< HEAD

    @OneToMany
    @JoinColumn(name = "user_type_id")
    private Set<User> users = new HashSet<>(); //prevents inserting duplicates
=======
>>>>>>> origin/master
}
