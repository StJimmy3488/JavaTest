package com.example.JavaTest.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "contract_type")
@Entity
@Data
@NoArgsConstructor
public class ContractType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @NotNull
    @Column(name = "contract_type")
    private String contractType;
    @OneToMany
    @JoinColumn(name = "contract_id")
    private Set<Contract> contracts = new HashSet<>();
}
