package com.tom.ppm.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity handleProjectIdException(ProjectIdException ex, WebRequest request){
        ProjectIdExceptionsResponse exceptionsResponse = new ProjectIdExceptionsResponse(ex.getMessage());
        return new ResponseEntity(exceptionsResponse, HttpStatus.BAD_REQUEST);
    }
}
