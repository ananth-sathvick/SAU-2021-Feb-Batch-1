package Mypackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceShape {

    @Autowired
    private Circle circle;
    
    public void getCircleException()  throws ArithmeticException {
        System.out.println("Exception raised");
        throw new ArithmeticException();
    }
    
    public Circle getCircle()  throws ArithmeticException {
        System.out.println("Inside getCircle");
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
    

}
