package com.legato.repository;

import com.legato.model.entity.MemberEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends MongoRepository<MemberEntity, Integer> {
    Optional<MemberEntity> findById(String id);
}
