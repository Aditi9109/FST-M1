class Car:

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer+" "+self.model+"  is moving")

    def stop(self):
        print(self.manufacturer+" "+self.model+"  has stopped")

obj1 = Car("Tata","Nexon","2020","manual","white")
obj2 = Car("Hyundai","venue","2021","manual","black")
obj3 = Car("Kia","Sonet","2022","Auto","Silver") 

obj1.accelerate()
obj1.stop()
obj2.accelerate()
obj2.stop()
obj3.accelerate()
obj3.stop()
        