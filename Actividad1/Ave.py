from Animal import animal

class Ave(animal):
    def __init__(self, nombre, peso, año_nacimiento, propietario):
        super().__init__(nombre, peso)
        self.año_nacimiento = año_nacimiento
        self.propietario = propietario

    def calcular_edad(self):
        año_actual = 2024 
        edad = año_actual - self.año_nacimiento
        if edad > 5:
                return "es Mayor de Edad"
        else:
                return "es Menor de edad"

ave1 = Ave("Pedro", 2, 2023, "Juan")
print("su propietario es",ave1.propietario,"y nacio en el", ave1.año_nacimiento ,ave1.calcular_edad()) #