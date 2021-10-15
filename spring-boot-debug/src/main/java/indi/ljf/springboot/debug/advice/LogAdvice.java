package indi.ljf.springboot.debug.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author: ljf
 * @date: 2021/10/12 10:10
 * @description: 日志aop
 * @modified By:
 * @version: $ 1.0
 */
@Aspect
@Component
public class LogAdvice {
	private static final Logger LOGGER = LoggerFactory.getLogger(LogAdvice.class);


	/**
	 * 连接点，即正则匹配的方法
	 */
	@Pointcut("execution(* indi.ljf.springboot.debug.*.*.*(..))")
	public void pointcut() {
	}

	@Before("pointcut()")
	public void beginLog() {
		System.out.println("before 通知");
	}

	@AfterThrowing("pointcut()")
	public String afterThrowing(JoinPoint joinPoint) {
		System.out.println("方法报错");
		return "方法出错，" + joinPoint.getSignature().getName();
	}

	@Around("pointcut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		Object[] args = joinPoint.getArgs();
		LOGGER.info("方法：{}，入参：{}", joinPoint.getSignature().getName(), args);
		try {
			Object result = joinPoint.proceed();
			LOGGER.info("方法：{}，返回结果：{}", joinPoint.getSignature().getName(), result);
			return result;
		} catch (Throwable e) {
			LOGGER.info("方法：{}，出错：{}", joinPoint.getSignature().getName(), e.getMessage());
			throw e;
		}
	}

	@After("pointcut()")
	public void afterLog() {
		System.out.println("after通知");
	}

}
