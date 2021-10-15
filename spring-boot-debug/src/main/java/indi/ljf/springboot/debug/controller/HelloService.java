package indi.ljf.springboot.debug.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: ljf
 * @date: 2021/10/14 22:55
 * @description:
 * @modified By:
 * @version: $ 1.0
 */
@Service
public class HelloService {
	//	@Autowired
//	private HelloController helloController;
//
//	public String hello(String name) {
//		return String.format(helloController.callback(name) + " %s,service", name);
//	}
	public HelloService(){
		System.out.println("helloService init");
	}
	public String hello(String name) {
		return "service, " + name;
	}
}
