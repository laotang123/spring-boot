package indi.ljf.springboot.debug.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ljf
 * @date: 2021/10/11 10:28
 * @description:
 * @modified By:
 * @version: $ 1.0
 */
@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello(@RequestParam String name) {
//		int j = 1 / 0;
		return "hello," + name;
	}
}
