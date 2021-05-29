package com.legato.service;

import com.legato.constants.AppConstants;
import com.legato.exceptions.BusinessException;
import com.legato.model.entity.MemberEntity;
import com.legato.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class LoginServiceImpl implements LoginService {

    MemberRepository repository;

    @Override
    public MemberEntity login(String memberName, String password) throws BusinessException {
        Optional<MemberEntity> response = repository.findByMemberNameAndPassword(memberName, password);
        if (response.isPresent()) {
             return response.get();
        }else
            throw new BusinessException(AppConstants.ErrorCode.AUTHENTICATION_FAILED);
    }
}
