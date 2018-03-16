package selenablank

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ThingSpec extends Specification implements DomainUnitTest<Thing> {

    void 'test name cannot be blank'() {

        when:
        domain.name = ' '

        then:
        !domain.validate(['name'])
        domain.errors['name'].code == 'blank'
    }
}
