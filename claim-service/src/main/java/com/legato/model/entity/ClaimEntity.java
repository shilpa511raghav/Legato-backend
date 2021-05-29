package com.legato.model.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;

@Document(collection = "claim")
@Data
@Builder
public class ClaimEntity {
    @Id
    private String id;
    private String memberName;
    private LocalDate birthdate;
    private String dateOfAdmission;
    private String dateOfDischarge;
    private String provider;
    private Integer totalBill;
}
