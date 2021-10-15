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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_type_id")
    private Long id;
    @NotNull
    @Column(name = "contract_type")
    private String contractType;
    @NotNull
    @Column(name = "contract_price",
            precision = 16,
            scale = 2, nullable = false)
    private Float contractPrice;
    @OneToMany
    @JoinColumn(name = "id")
    private Set<Contract> contracts = new HashSet<>();
}
