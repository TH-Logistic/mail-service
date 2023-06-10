package com.thlogistic.mailservice.adapters.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TenantActivatedRequest extends BaseMailRequest{
    @NotEmpty(message = "Invalid name")
    String name;
    @NotEmpty(message = "Invalid package name")
    String packageName;
}
