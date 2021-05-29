package com.legato.controller;

import static com.legato.constants.AppConstants.ErrorCode;

import com.legato.model.AppError;
import com.legato.model.entity.MemberEntity;
import com.legato.model.request.AddMemberRequest;
import com.legato.model.request.UpdateMemberRequest;
import com.legato.model.response.AddMemberResponse;
import com.legato.model.response.UpdateMemberResponse;
import com.legato.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@CrossOrigin(origins = "http://localhost:3000")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/add")
    public AddMemberResponse saveMemberDetail(@RequestBody AddMemberRequest addRequest) {
        AddMemberResponse response = new AddMemberResponse();
        try {
            response.setMember(memberService.saveMemberDetail(addRequest.getMember()));
        } catch (Exception e) {
            response.setAppError(
                    AppError.builder()
                            .code(ErrorCode.DB_ERROR.getCode())
                            .message(ErrorCode.DB_ERROR.getMessage())
                            .build()
            );
        }
        return response;
    }

    @GetMapping("/getOne/{id}")
    public MemberEntity findMemberById(@PathVariable String id) {
        return memberService.getMemberById(id);
    }

    @PutMapping("/update/{id}")
    public UpdateMemberResponse updateMemberById(@PathVariable String id, @RequestBody UpdateMemberRequest memberUpdateInput) {
        UpdateMemberResponse response = new UpdateMemberResponse();
        try {
            response.setMember(memberService.updateMemberDetail(id, memberUpdateInput.getMember()));
        } catch (Exception e) {
            response.setAppError(
                    AppError.builder()
                            .code(ErrorCode.DB_ERROR.getCode())
                            .message(ErrorCode.DB_ERROR.getMessage())
                            .build()
            );
        }
        return response;
    }


}
