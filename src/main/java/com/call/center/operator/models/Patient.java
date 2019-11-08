package com.call.center.operator.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "mis.patients_mis")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String sirname ;
    private String name  ;
    private String patronymic   ;
    private LocalDate birth    ;
    private String phone;
    private String address ;
    private String mail  ;
    private String remark   ;
    private String history    ;
    private Integer localid;
    private String podr;
    private LocalDate regdate;
    private String rem;
    private String rem2 ;
    private Integer insurance_id;
    private Integer user_id ;
    private String uid;
    private String full_name ;
    private Integer created_at  ;
    private Integer updated_at   ;
    private LocalDate last_visit;
    @Lob
    private String comment;
    private Boolean dms;
    private Boolean oms ;

}
