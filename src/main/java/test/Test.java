package test;

import foo.bla.MyService;
import org.distributeme.core.ServiceLocator;

import java.util.Date;

/**
 * @author ykalapusha
 */
public class Test {

    public static void main(String[] args) {
        MyService service = ServiceLocator.getRemote(MyService.class);
        String message = "Hello world at ONG"+new Date(System.currentTimeMillis());
        System.out.println("Server should print out following message now: "+message);
        service.printMessage(message);
    }
}
