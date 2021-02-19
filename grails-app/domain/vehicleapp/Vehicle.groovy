package vehicleapp

class Vehicle {

    Integer year
    String type
    Make make
    Model model

    static constraints = {
        type maxSize:  255
        year min: 1900
    }
}
