package indi.ljf.springboot.debug.controller;

import indi.ljf.springboot.debug.entity.Student;
import indi.ljf.springboot.debug.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: ljf
 * @date: 2021/10/11 10:28
 * @description:
 * @modified By:
 * @version: $ 1.0
 */
@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/hello")
	public String hello(@RequestParam String name) {
//		int j = 1 / 0;
		return studentService.hello("controller " + name);
//		return "hello, " + name;
	}

	@GetMapping("/callback")
	public String callback(@RequestParam String name) {
		return "callback," + name;
	}

	@GetMapping("/students/{id}")
	public String query(@PathVariable Integer id) {
		return studentService.query(id).toString();
	}
}
