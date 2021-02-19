package vehicleapp

class Model {

    String name

    static belongsTo = [make: Make]

    static constraints = {
    }

    @Override
    String toString() {
        name
    }
}
