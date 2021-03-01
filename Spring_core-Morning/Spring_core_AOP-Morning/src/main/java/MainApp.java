import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sau.service.ShapeService;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		
		System.out.println("------------Set Circle Name------------");
		shapeService.getCircle().setName("My circle 1");
		System.out.println();
		System.out.println("------------Get Circle Name------------");
		System.out.println("Name = "+shapeService.getCircle().getName());
		System.out.println();
		System.out.println("------------Exception------------");

		shapeService.getRectangle().setName("Exception create");
		System.out.println();
	}
}
