class Pantalla:
    def __init__(self, tipo="amoled", ancho=7, alto=6):
        self.__tipo = tipo
        self.__alto = alto
        self.__ancho = ancho

    def getAncho(self):
        return self.__ancho

    def __str__(self):
        return "Pantalla{" + "tipo=" + self.__tipo + ", alto=" + str(self.__alto) + ", ancho=" + str(self.__ancho) + "}"