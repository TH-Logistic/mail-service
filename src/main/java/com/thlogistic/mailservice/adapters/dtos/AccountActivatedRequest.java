package com.thlogistic.mailservice.adapters.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountActivatedRequest {
    @NotEmpty(message = "Invalid name")
    String name;
    @NotEmpty(message = "Invalid email")
    String email;
}
