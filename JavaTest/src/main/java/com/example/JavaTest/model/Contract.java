package com.example.JavaTest.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
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
    @Temporal(TemporalType.DATE)
    @Column(name = "contract_start_date")
    private Date contractStartDate;

    @ManyToMany(mappedBy = "contracts")
    @ToString.Exclude   //to prevent stack over flow
    private Set<User> userSet = new HashSet<>();


}
