package com.legato.exceptions;

import com.legato.constants.AppConstants;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BusinessException extends  Exception {
    private AppConstants.ErrorCode error;
}
