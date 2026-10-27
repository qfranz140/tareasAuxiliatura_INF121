class Aplicacion:
    def __init__(self, nombre=None, tamanio=0):
        self.__nombre = nombre
        self.__tamanio = tamanio

    def getNombre(self):
        return self.__nombre

    def getTamanio(self):
        return self.__tamanio

    def __str__(self):
        return "Aplicacion{" + "nombre=" + str(self.__nombre) + ", tamanio=" + str(self.__tamanio) + "}"