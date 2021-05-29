package com.legato.controller;

import com.legato.constants.AppConstants;
import com.legato.model.AppError;
import com.legato.model.request.AddClaimRequest;
import com.legato.model.response.AddClaimResponse;
import com.legato.model.response.GetAllClaimResponse;
import com.legato.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/claim")
@CrossOrigin(origins = "http://localhost:3000")
public class ClaimController {

    @Autowired
    ClaimService claimService;

    @PostMapping("/add")
    public AddClaimResponse addClaimDetails(@RequestBody AddClaimRequest addClaimRequest){
        AddClaimResponse response = new AddClaimResponse();
        try {
            response.setClaim(claimService.saveClaimDetail(addClaimRequest.getClaim()));
        }catch (Exception e){
            response.setAppError(AppError
                    .builder()
                    .code(AppConstants.ErrorCode.DB_ERROR.getCode())
                    .build());
        }
        return response;
    }

    @GetMapping("/getAllForMember/{memberName}")
    public GetAllClaimResponse getClaimsOfMember(@PathVariable String memberName){
        GetAllClaimResponse response = new GetAllClaimResponse();
        try{
            response.setClaimList(claimService.getAllClaimOfMember(memberName));
        }catch(Exception e){
            response.setAppError(AppError
                    .builder()
                    .code(AppConstants.ErrorCode.RECORD_NOT_FOUND.getCode())
                    .build());
        }
        return response;
    }

}
