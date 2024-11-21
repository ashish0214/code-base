package BeanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Home {
    int name;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
    @PostConstruct
    public void init(){
        System.out.println("init annotation ");
    }

    @PreDestroy
    public  void destroy(){
        System.out.println("destroy annotation");
    }
}
