package Mypackage;

import org.springframework.stereotype.Component;

@Component
public class FacrtoryService {
    public Object getBean(String beanType){
        if(beanType.equals("circle")) return new Circle();
        return null;
    }
}
