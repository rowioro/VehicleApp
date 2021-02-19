package vehicleapp

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class AnotherServiceSpec extends Specification implements ServiceUnitTest<AnotherService>{

    void "get static vehicle"() {
        expect:
        service.randomVehicle.id != null
    }
}
