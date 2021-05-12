package smoketest.web.ui.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ljf
 * @date: 2021/5/12 9:27
 * @description: 测试
 * @modified By:
 * @version: $ 1.0
 */
@RestController
public class HelloController {
	@GetMapping("hello")
	public String hello() {
		return "hello,world";
	}
}
