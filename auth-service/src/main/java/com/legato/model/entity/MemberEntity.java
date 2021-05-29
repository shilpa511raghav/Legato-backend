package com.legato.model.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "member")
@Data
@Builder
public class MemberEntity {
    @Id
    private String id;
    private String memberName;
    private String memberEmail;
    private String contact;
    private String country;
    private String state;
    private String address;
    private String pan;
    private LocalDate birthdate;
    private String password;
}
