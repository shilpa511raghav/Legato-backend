package com.legato.service.implementation;

import com.legato.constants.AppConstants;
import com.legato.exceptions.BusinessException;
import com.legato.model.entity.MemberEntity;
import com.legato.repository.MemberRepository;
import com.legato.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public MemberEntity saveMemberDetail(MemberEntity member) {
        return memberRepository.save(member);
    }

    @Override
    public MemberEntity getMemberById(String id) {
        Optional<MemberEntity> memberData = memberRepository.findById(id);
        if(memberData.isPresent()) {
            return memberData.get();
        }else {
            return null;
        }
    }

    @Override
    public MemberEntity updateMemberDetail(String id, MemberEntity inputUpdateInfo) throws BusinessException {
        Optional<MemberEntity> memberResponseData = memberRepository.findById(id);
        if(memberResponseData.isPresent()){
            inputUpdateInfo.setId(id);
            return memberRepository.save(inputUpdateInfo);
        }else{
            throw new BusinessException(AppConstants.ErrorCode.RECORD_NOT_FOUND);
        }
    }
}
