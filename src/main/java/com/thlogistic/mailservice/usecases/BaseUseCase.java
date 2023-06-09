package com.thlogistic.mailservice.usecases;

public interface BaseUseCase<Request, Response> {
    Response execute(Request request);
}
