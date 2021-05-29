package com.legato.model.request;

import com.legato.model.entity.MemberEntity;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddMemberRequest {
    @NonNull
    MemberEntity member;
}
