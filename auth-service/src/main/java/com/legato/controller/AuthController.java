package com.legato.controller;

import com.legato.exceptions.BusinessException;
import com.legato.model.AppError;
import com.legato.model.request.LoginRequest;
import com.legato.model.response.LoginResponse;
import com.legato.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.legato.constants.AppConstants.ErrorCode.INTERNAL_ERROR;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public LoginResponse saveMemberDetail(@RequestBody LoginRequest loginRequest) {
        LoginResponse response = new LoginResponse();
        try {
            response.setMember(loginService.login(loginRequest.getUserName(), loginRequest.getPassword()));
        } catch (BusinessException e) {
            response.setAppError(
                    AppError.builder()
                            .message(e.getError().getMessage())
                            .code(e.getError().getCode())
                            .build()
            );
        } catch (Exception e) {
            response.setAppError(
                    AppError.builder()
                            .message(INTERNAL_ERROR.getMessage())
                            .code(INTERNAL_ERROR.getCode())
                            .build()
            );
        }
        return response;
    }

}
