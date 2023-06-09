package com.thlogistic.mailservice.adapters.controllers;

import com.thlogistic.mailservice.adapters.dtos.*;
import com.thlogistic.mailservice.usecases.ForgetPasswordUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailController extends BaseController implements MailResource {

    private final ForgetPasswordUseCase forgetPasswordUseCase;

    @Override
    public ResponseEntity<Object> forgetPassword(ForgetPasswordRequest request) {
        forgetPasswordUseCase.execute(request);
        return successResponse(true, null);
    }

    @Override
    public ResponseEntity<Object> accountActivated(AccountActivatedRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Object> accountSuspended(AccountSuspendedRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Object> tenantActivated(TenantActivatedRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<Object> tenantSuspended(TenantSuspendedRequest request) {
        return null;
    }
}
