package com.example.JavaTest.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Table(name = "user")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @NotNull
    @Column(name = "user_name", nullable = false)
    private String userName;
    @NotNull
    @Column(name = "user_surname", nullable = false)
    private String userSurname;
    @NotNull
    @Column(name = "user_dob")
    private LocalDate userBirthDate;
    @Transient
    private Integer Age;
    @NotNull
    @Column(name = "user_type_id")
    private Integer userTypeId;
//    @NotNull
//    @Column(nullable = false)
//    private LocalDate contractStartDate;   //add days left
//    @NotNull
//    @Column(nullable = false)
//    private LocalDate contractEndDate;

    public int getUserAge() {
        return Period.between(this.userBirthDate, LocalDate.now()).getYears();
    }

}


