package vehicleapp

class BootStrap {

    def init = { servletContext ->
        Make porsche = new Make(name: 'Porsche')
        Model p911 = new Model(name: '911', make: porsche)
        new Vehicle(type: 'Sport', year: 2018, make: porsche, model: p911).save()
    }
    def destroy = {
    }
}
