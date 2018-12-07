package net.sunnada.base.controller;

import net.sunnada.pojo.Result;
import net.sunnada.pojo.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exception(Exception e) {
        return new Result(StatusCode.ERROR, false, e.getMessage(), null);
    }
}
