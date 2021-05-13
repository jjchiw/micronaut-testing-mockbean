package ka

import io.micronaut.test.annotation.MockBean
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Unroll

import javax.inject.Inject

@MicronautTest
class FooServiceWithMockSpec extends Specification {

    @Inject
    FooService fooService

    @Inject
    BarService barService

    @Unroll
    void 'fail with mock'() {
        given:
        1 * barService.send(_)

        when:
        def r = fooService.alwaysTrue()

        then:
        r == true
    }

    @MockBean(BarService)
    BarService barService() {
        return Mock(BarService)
    }
}
