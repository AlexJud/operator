package com.call.center.operator.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "mis.patients_mis")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Integer id;
    @NotNull
    private String sirname ;
    @NotNull
    private String name  ;
    @NotNull
    private String patronymic   ;
    @NotNull
    private LocalDate birth    ;
    @NotNull
    private String phone;
    @NotNull
    private String address ;
    @NotNull
    private String mail  ;
    @NotNull
    private String remark;
    @NotNull
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
