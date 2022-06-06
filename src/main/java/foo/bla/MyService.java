package foo.bla;

import org.distributeme.annotation.DistributeMe;
import net.anotheria.anoprise.metafactory.Service;
/**
 * @author ykalapusha
 */

@DistributeMe
public interface MyService extends Service {
    void printMessage(String message);
}
