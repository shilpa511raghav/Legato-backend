package com.legato.model.response;


import com.legato.model.AppError;
import com.legato.model.entity.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateMemberResponse {
    MemberEntity member;
    AppError appError;
}
