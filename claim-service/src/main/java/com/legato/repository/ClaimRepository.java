package com.legato.repository;

import com.legato.model.entity.ClaimEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimRepository extends MongoRepository<ClaimEntity, Integer> {
    List<ClaimEntity> findByMemberName(String memberName);
}
