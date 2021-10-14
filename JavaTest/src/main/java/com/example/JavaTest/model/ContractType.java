package com.example.JavaTest.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
<<<<<<< HEAD
import java.util.HashSet;
import java.util.Set;
=======
>>>>>>> origin/master

@Table(name = "contract_type")
@Entity
@Data
@NoArgsConstructor
public class ContractType {
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
>>>>>>> origin/master
    private Long id;
    @NotNull
    @Column(name = "contract_type")
    private String contractType;
<<<<<<< HEAD
    @OneToMany
    @JoinColumn(name = "contract_id")
    private Set<Contract> contracts = new HashSet<>();
=======
>>>>>>> origin/master
}
