package Mypackage;

import org.springframework.stereotype.Component;

@Component
public class Circle {

        private String name="Circle";
        
        @Loggable
        public String getName()  {
            System.out.println("Inside getName of Circle ");
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
