package vehicleapp

import java.time.LocalDate

class HomeController {

    def index() {
        respond([name: session.name ?:
                'User',
                 vehicleTotal: Vehicle.count(),
                 currentDate: LocalDate.now(),
                 allVehicle: Vehicle.list()])
    }

    def updateName(String name) {
        session.name = name

        flash.message = "Name has been updated"

        redirect action: 'index'
    }
}
