package com.legato.model.response;


import com.legato.model.AppError;
import com.legato.model.entity.ClaimEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddClaimResponse {
    ClaimEntity claim;
    AppError appError;
}
