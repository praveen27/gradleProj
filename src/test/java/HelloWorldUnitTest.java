import org.junit.Before;
import org.junit.Test;

/**
 * Created by praveenr on 9/22/17.
 */

public class HelloWorldUnitTest {

    private HelloWorld helloWorld = new HelloWorld();
    @Before
    public void initHelloWorldUnitTest(){
        System.out.println("Before running a unit test");
    }

    @Test
    public void firstTest() {
        System.out.println("Running unit test firstTest");
        System.out.println(helloWorld.printMe("firstTest"));
    }

    @Test (expected = RuntimeException.class)
    public void expectAnException(){
        System.out.println(helloWorld.printMe(null));
    }

}
