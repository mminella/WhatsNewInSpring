@RestController
class ThisIsASpringApp {
	
	@RequestMapping("/")
	String home() {
		return "Welcome to Spring Boot!"
	}
}
