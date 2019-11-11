package com.call.center.operator.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "mis.incoming_call")
public class Call {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Integer id;
    private String uid;
    private String src;
    private String dst;
    private LocalDateTime date_start;
    private LocalDateTime date_stop;
    private String status;
    private String classification ;
    @Lob
    private String comment  ;
}
