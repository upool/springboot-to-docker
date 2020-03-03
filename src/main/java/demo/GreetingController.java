package demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class GreetingController {
	
	private static final String template = "Hola, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting getGreeting(@RequestParam(value="name", defaultValue = "Mundo") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
		
	}
}
