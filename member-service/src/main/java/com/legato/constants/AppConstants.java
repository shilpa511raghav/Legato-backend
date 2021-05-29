package com.legato.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class AppConstants {


    @AllArgsConstructor
    @Getter
    public enum ErrorCode {
        INTERNAL_ERROR(001, "Unknown issue"),
        AUTHENTICATION_FAILED(002, "Username or password wrong"),
        DB_ERROR(003, "Something wrong with DB"),
        INVALID_TOKEN(004, "Invalid JWT token"),
        RECORD_NOT_FOUND(005, "No record found");
        private Integer code;
        private String message;
    }
}
