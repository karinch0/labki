package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;


@SpringBootApplication
@Controller
public class Application {

	@RequestMapping("/")
	public String home() {
		return "hello"; // hello.html in templates;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/calculator")
	public String calculator() {
		return "calculator"; // calculator.html
	}

	@RestController
	public class CalculatorController {

		@PostMapping("/calculate")
		public String calculate(@RequestParam String expression) {
			try {
				// exp4j for calculations
				net.objecthunter.exp4j.Expression e = new net.objecthunter.exp4j.ExpressionBuilder(expression).build();
				double result = e.evaluate();
				return "Результат: " + result;
			} catch (Exception ex) {
				return "Помилка!";
			}
		}
	}

}
