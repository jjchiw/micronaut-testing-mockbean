package ka

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Unroll

import javax.inject.Inject

@MicronautTest
class FooServiceWithoutMockSpec extends Specification {

    @Inject
    FooService fooService

    @Unroll
    void 'test it works'() {
        when:
        def r = fooService.alwaysTrue()

        then:
        r == true
    }
}
