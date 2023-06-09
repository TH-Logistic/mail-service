package com.thlogistic.mailservice.adapters.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


@Data
public class BaseMailRequest {
    @NotEmpty(message = "Invalid destination email")
    String destinationEmail;
}
