package com.legato.model.response;

import com.legato.model.AppError;
import com.legato.model.entity.ClaimEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetAllClaimResponse {
    List<ClaimEntity> claimList;
    AppError appError;
}
