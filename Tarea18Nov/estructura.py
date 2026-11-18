class Anuncio:
    def __init__(self, num=0, pre=0.1):
        self.__numero = num
        self.__precio = pre

    def getNumero(self):
        return self.__numero

    def getPrecio(self):
        return self.__precio

class Artista:
    def __init__(self, nom, car, anios):
        self.__nombre = nom
        self.__ci = car
        self.__aniosExp = anios

    def getAnios(self):
        return self.__aniosExp

    def getNombre(self):
        return self.__nombre

class Obra:
    
    def __init__(self, titulo, material, nom1, car1, anio1, nom2, car2, anio2):
        self._titulo = titulo 
        self._material = material
        self._artista1 = Artista(nom1, car1, anio1)
        self._artista2 = Artista(nom2, car2, anio2)
        self._anuncio = None

    def agregarAnuncio(self, anun):
        self._anuncio = anun

    def getArt1(self):
        return self._artista1

    def getArt2(self):
        return self._artista2

    def getAnuncio(self):
        return self._anuncio

    def artistaMayorExp(self):
        if self._artista1.getAnios() >= self._artista2.getAnios():
            return self._artista1
        return self._artista2

class Pintura(Obra):
    def __init__(self, titulo:str, material:str, nom1, car1, anio1, nom2, car2, anio2, gen):
        super().__init__(titulo, material, nom1, car1, anio1, nom2, car2, anio2)
        self.__genero = gen
        


class Main():
    a1 = Anuncio() 
    a2 = Anuncio(2, 2.3)

    #inciso a
    p1 = Pintura("monalisa", "oleo", "davinci", 123, 20, "joel", 321, 1, "intriga")
    p2 = Pintura("monalisa", "oleo", "davinci", 123, 20, "adrian", 444, 4, "cuatro")
    p1.agregarAnuncio(a1)

    #inciso b
    m1 = p1.artistaMayorExp()
    m2 = p2.artistaMayorExp()
    if m1.getAnios() >= m2.getAnios():
        mayor = m1
    else:
        mayor = m2
    print("Artista con más experiencia:", mayor.getNombre())

    #inciso c
    p2.agregarAnuncio(a2)
    total = p1.getAnuncio().getPrecio() + p2.getAnuncio().getPrecio()
    print("Monto total de venta:", total)