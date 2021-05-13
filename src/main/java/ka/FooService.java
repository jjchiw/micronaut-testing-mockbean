package ka;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class FooService {
    @Inject
    BarService barService;

    public boolean alwaysTrue(){
        barService.send(null);
        return true;
    }
}
