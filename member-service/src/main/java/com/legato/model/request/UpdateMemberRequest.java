package com.legato.model.request;

import com.legato.model.entity.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateMemberRequest {
    @NonNull
    MemberEntity member;
}
