package indi.ljf.springboot.debug.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * student
 * @author 
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
}