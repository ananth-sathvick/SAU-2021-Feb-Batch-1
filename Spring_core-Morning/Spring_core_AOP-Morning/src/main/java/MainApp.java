import Mypackage.ServiceShape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
        ServiceShape serviceShape = ctx.getBean("serviceShape",ServiceShape.class);
        serviceShape.getCircle().getName();
        serviceShape.getCircleException();
        

    }
}
