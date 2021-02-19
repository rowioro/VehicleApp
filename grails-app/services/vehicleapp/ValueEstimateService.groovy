package vehicleapp

import grails.gorm.transactions.Transactional

@Transactional
class ValueEstimateService {

    def getEstimate(Vehicle vehicle) {
        log.info 'Estimating vehicle value...'

        //TODO: Call third-party valuation API
        Math.round (vehicle.type.size() + vehicle.model.name.size() * vehicle.year) * 2
    }
}
