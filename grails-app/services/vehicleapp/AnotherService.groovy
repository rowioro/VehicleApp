package vehicleapp

import grails.gorm.transactions.Transactional

@Transactional
class AnotherService {

    def getStaticVehicle() {
        Make ferrari = new Make(name: 'Ferrari')
        Model testarossa = new Model(name: 'Testarossa', make: ferrari)
        return new Vehicle(type: 'Sport', year: 2018, make: ferrari, model: testarossa).save()
    }

    def getRandomVehicle() {
        def allVehicle = Vehicle.list()
        def randomVehicle = null
        if (allVehicle.size() > 0) {
            def randomIdx = new Random().nextInt(allVehicle.size())
            randomVehicle = allVehicle[randomIdx]
        } else {
            randomVehicle = getStaticVehicle()
        }
        return randomVehicle
    }
}
