package com.example.JavaTest.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "contract")
@Entity
@Data
@NoArgsConstructor
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Long id;
    @NotNull
    @Column(name = "contract_type_id", nullable = false)
    private Long contractTypeId;
    @NotNull
    @Column(name = "contract_price", nullable = false)
    private Float contractPrice;
    @ManyToMany(mappedBy = "contracts")
//    @ToString.Exclude   //to prevent stack over flow
    private Set<User> userSet = new HashSet<>();


}
