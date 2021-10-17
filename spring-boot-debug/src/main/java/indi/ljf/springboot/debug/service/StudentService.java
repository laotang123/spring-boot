package indi.ljf.springboot.debug.service;

import indi.ljf.springboot.debug.entity.Student;
import indi.ljf.springboot.debug.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: ljf
 * @date: 2021/10/14 22:55
 * @description:
 * @modified By:
 * @version: $ 1.0
 */
@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;

	//
//	public String hello(String name) {
//		return String.format(helloController.callback(name) + " %s,service", name);
//	}
	public StudentService() {
		System.out.println("helloService init");
	}

	public String hello(String name) {
		return "service, " + name;
	}

	public Student query(Integer id) {
		return studentMapper.selectByPrimaryKey(id);
	}

	@Transactional
	public Integer addStudent(Student student) {
		int i = 1 / 0;
		return studentMapper.insertSelective(student);
	}
}
