<<<<<<< HEAD
//package com.example.JavaTest.model;
//
//import com.sun.istack.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.sql.Date;
//import java.time.LocalDate;
//
//@Table(name = "user_contract")
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class UserContract {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//    @NotNull
//    @Column(name = "contract_id", nullable = false)
//    private Long contractId;
//    @NotNull
//    @Column(name = "user_id", nullable = false)
//    private Long userId;
//    @NotNull
//    @Column(name = "contract_start_date", nullable = false)
//    private LocalDate contractStartDate;
//    @NotNull
//    @Column(name = "contract_end_date", nullable = false)
//    private LocalDate contractEndDate;
//
//
//}
=======
package com.example.JavaTest.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Table(name = "user_contract")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotNull
    @Column(name = "contract_id", nullable = false)
    private Long contractId;
    @NotNull
    @Column(name = "user_id", nullable = false)
    private Long userId;
    @NotNull
    @Column(name = "contract_start_date", nullable = false)
    private LocalDate contractStartDate;
    @NotNull
    @Column(name = "contract_end_date", nullable = false)
    private LocalDate contractEndDate;


}
>>>>>>> origin/master
