package ka;

import io.micronaut.context.annotation.Factory;
import javax.inject.Singleton;

@Factory
class BaseServiceFactory {

    @Singleton
    BarService barService() {
        return new BarServiceImpl();
    }
}
