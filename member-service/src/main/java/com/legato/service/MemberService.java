package com.legato.service;

import com.legato.exceptions.BusinessException;
import com.legato.model.entity.MemberEntity;

public interface MemberService {
    public  MemberEntity saveMemberDetail(MemberEntity member);
    public  MemberEntity getMemberById(String id);
    public  MemberEntity updateMemberDetail(String id, MemberEntity member) throws BusinessException;

}
