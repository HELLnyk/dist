package foo.bla;

import org.distributeme.annotation.DistributeMe;
import net.anotheria.anoprise.metafactory.Service;
import org.distributeme.annotation.FailBy;
import org.distributeme.core.failing.Failover;

/**
 * @author ykalapusha
 */

@DistributeMe
@FailBy(strategyClass = Failover.class)
public interface MyService extends Service {
    void printMessage(String message);
}
