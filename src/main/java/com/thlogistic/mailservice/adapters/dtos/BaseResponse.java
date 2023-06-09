package com.thlogistic.mailservice.adapters.dtos;


import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse<T> implements Serializable {
    String message;
    Boolean success;
    T data;
}
