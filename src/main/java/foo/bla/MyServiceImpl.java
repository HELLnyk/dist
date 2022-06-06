package foo.bla;

/**
 * @author ykalapusha
 */
public class MyServiceImpl implements MyService{
    @Override
    public void printMessage(String message) {
        System.out.println("M: " + message);
    }
}
