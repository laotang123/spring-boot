package indi.ljf.springboot.debug;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: ljf
 * @date: 2021/10/11 10:09
 * @description:
 * @modified By:
 * @version: $ 1.0
 */
//@MapperScan({"indi.ljf.springboot.debug.mapper.**"})
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}
}
