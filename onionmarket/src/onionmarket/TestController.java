package onionmarket;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("test.do")
	public String test() throws SQLException {
		return "test";
	}
}
