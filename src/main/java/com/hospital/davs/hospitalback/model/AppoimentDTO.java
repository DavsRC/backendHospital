package com.hospital.davs.hospitalback.model;


import com.hospital.davs.hospitalback.aleaList.Area;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppoimentDTO {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String namePatient;
    private int ccPatient;
    private String nameDoctor;
    private Area area;
    private LocalDateTime dateAppoiment;
}
