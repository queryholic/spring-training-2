package com.multicampus.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service("log")
@Aspect
public class LogAdvice {
	
	@Before("PointcutCommon.allPointcut()")
	public void printLog(JoinPoint jp) {
		
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[���� ó��] ����Ͻ� �޼ҵ� " + method + "() �޼ҵ� ARGS ���� : " + args[0].toString());
	}
}