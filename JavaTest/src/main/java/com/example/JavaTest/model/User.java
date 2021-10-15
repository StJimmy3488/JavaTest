package com.example.JavaTest.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

@Table(name = "user")
@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @NotNull
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "user_surname")
    private String userSurname;
    @Column(name = "user_dob")
    private LocalDate userBirthDate;
    @Transient
    private Integer Age;
    @NotNull
    @Column(name = "user_type_id")
    private Long userTypeId;

@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(
        name = "user_contract", joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "contract_id"))
private Set<Contract> contracts = new HashSet<>();

    public int getUserAge() {
        return Period.between(this.userBirthDate, LocalDate.now()).getYears();
    }
}


