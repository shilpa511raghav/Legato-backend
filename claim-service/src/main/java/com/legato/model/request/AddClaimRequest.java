package com.legato.model.request;

import com.legato.model.entity.ClaimEntity;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddClaimRequest {
    @NonNull
    ClaimEntity claim;
}
