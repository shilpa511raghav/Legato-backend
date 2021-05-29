package com.legato.service;

import com.legato.model.entity.ClaimEntity;

import java.util.List;

public interface ClaimService {
    ClaimEntity saveClaimDetail (ClaimEntity claimDetail);
    List<ClaimEntity> getAllClaimOfMember(String memberName);
}
