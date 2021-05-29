package com.legato.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AppError {
    private int code;
    private String message;
}
