package com.legato.service;

import com.legato.model.entity.ClaimEntity;
import com.legato.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    ClaimRepository claimRepository;

    @Override
    public ClaimEntity saveClaimDetail(ClaimEntity claimDetail) {
        return claimRepository.save(claimDetail);
    }

    @Override
    public List<ClaimEntity> getAllClaimOfMember(String memberName) {
        return claimRepository.findByMemberName(memberName);
    }
}
