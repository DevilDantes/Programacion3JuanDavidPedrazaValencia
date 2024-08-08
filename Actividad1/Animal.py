class animal:
    def __init__(self,Nombre, peso):
        self.Nombre = Nombre
        self.peso = peso
    def obtenernombredelanimal(self):
        return f'{self.Nombre}'
    def obtenerelpesodelanimal(self):
        return f'{self.peso}'
p=animal("Pedro", "2 Kilos")
print("el nombre del animal es", p.obtenernombredelanimal(), "y su peso es", p.obtenerelpesodelanimal())
