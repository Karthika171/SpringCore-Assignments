package property;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:dbconfig.properties")
public class ApplicationScope {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext run = new AnnotationConfigApplicationContext(ApplicationScope.class);
		ExternalService personDAO = run.getBean(ExternalService.class);
		System.out.println(personDAO.toString());

		
	}

}
