package com.thlogistic.mailservice.adapters.controllers;

import com.thlogistic.mailservice.adapters.dtos.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/mail")
interface MailResource {

    @PostMapping("/forget-password")
    ResponseEntity<Object> forgetPassword(@Valid @RequestBody ForgetPasswordRequest request);

    @PostMapping("/account-activated")
    ResponseEntity<Object> accountActivated(@Valid @RequestBody AccountActivatedRequest request);

    @PostMapping("/account-suspended")
    ResponseEntity<Object> accountSuspended(@Valid @RequestBody AccountSuspendedRequest request);

    @PostMapping("/tenant-activated")
    ResponseEntity<Object> tenantActivated(@Valid @RequestBody TenantActivatedRequest request);

    @PostMapping("/tenant-suspended")
    ResponseEntity<Object> tenantSuspended(@Valid @RequestBody TenantSuspendedRequest request);
}
