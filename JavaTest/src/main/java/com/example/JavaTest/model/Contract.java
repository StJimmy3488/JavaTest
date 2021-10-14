package com.example.JavaTest.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Table(name = "contract")
@Entity
@Data
@NoArgsConstructor
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contract_id")
    private Long id;
    @NotNull
    @Column(name = "contract_type_id", nullable = false)
    private Long contractTypeId;
    @NotNull
    @Column(name = "contract_price", nullable = false)
    private Float contractPrice;
    @Column(name = "contract_start_date")
    private LocalDate contractStartDate;
//    private LocalDate contractEndDate;
    @ManyToMany(mappedBy = "contracts")
    @ToString.Exclude   //to prevent stack over flow
    private Set<User> userSet = new HashSet<>();


}
