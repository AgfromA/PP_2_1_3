package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
private String name;

public Dog(){

}
public String getName(){
    return name;
}
public void setName(){
    this.name = name;
}
    @Override
    public String toString() {
        return "Im a Dog";
    }
}

