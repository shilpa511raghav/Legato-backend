package com.legato.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AppError {
    int code;
    String message;
}
