package indi.ljf.springboot.debug.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

/**
 * student
 *
 * @author : ljf
 */
@Data
public class Student implements Serializable {
	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 年龄
	 */
	private Integer age;

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}