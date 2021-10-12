package indi.ljf.springboot.debug.advice;

import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: ljf
 * @date: 2021/9/18 10:44
 * @description: 全局异常处理
 * @modified By:
 * @version: $ 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({BindException.class})

	public String handleMethodArgumentNotValidException(BindException ex) {
		BindingResult bindingResult = ex.getBindingResult();
		StringBuilder sb = new StringBuilder("校验失败:");
		for (FieldError fieldError : bindingResult.getFieldErrors()) {
			sb.append(fieldError.getField()).append("：").append(fieldError.getDefaultMessage()).append(", ");
		}
		return sb.toString();
	}

	@ExceptionHandler({Exception.class})

	public String handleConstraintViolationException(Exception ex) {
		return ex.getMessage();
	}
}

