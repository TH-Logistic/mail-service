package com.thlogistic.mailservice.adapters.controllers;

import com.thlogistic.mailservice.adapters.dtos.*;
import com.thlogistic.mailservice.usecases.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailController extends BaseController implements MailResource {

    private final ForgetPasswordUseCase forgetPasswordUseCase;
    private final AccountActivatedUseCase accountActivatedUseCase;
    private final AccountSuspendedUseCase accountSuspendedUseCase;
    private final TenantActivatedUseCase tenantActivatedUseCase;
    private final TenantSuspendedUseCase tenantSuspendedUseCase;

    @Override
    public ResponseEntity<Object> forgetPassword(ForgetPasswordRequest request) {
        forgetPasswordUseCase.execute(request);
        return successResponse(true, null);
    }

    @Override
    public ResponseEntity<Object> accountActivated(AccountActivatedRequest request) {
        accountActivatedUseCase.execute(request);
        return successResponse(true, null);
    }

    @Override
    public ResponseEntity<Object> accountSuspended(AccountSuspendedRequest request) {
        accountSuspendedUseCase.execute(request);
        return successResponse(true, null);
    }

    @Override
    public ResponseEntity<Object> tenantActivated(TenantActivatedRequest request) {
        tenantActivatedUseCase.execute(request);
        return successResponse(true, null);
    }

    @Override
    public ResponseEntity<Object> tenantSuspended(TenantSuspendedRequest request) {
        tenantSuspendedUseCase.execute(request);
        return successResponse(true, null);
    }
}
