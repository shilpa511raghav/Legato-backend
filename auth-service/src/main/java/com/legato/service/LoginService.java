package com.legato.service;

import com.legato.exceptions.BusinessException;
import com.legato.model.entity.MemberEntity;

public interface LoginService {
    MemberEntity login(String memberName , String password) throws BusinessException;
}
