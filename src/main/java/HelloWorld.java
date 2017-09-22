

/**
 * Created by praveenr on 9/22/17.
 */
public class HelloWorld {

    public String printMe(String name){
        if(name == null){
            throw new RuntimeException("name cannot be null");
        }
        return "Hello :: " + name;
    }
}
