from pantalla import Pantalla

class Laptop:
    def __init__(self, modelo, cantApp, tipo, ancho, alto):
        self.__modelo = modelo
        self.__cantApp = cantApp
        self.__apps = []
        self.__pantalla = Pantalla()
        self.__pantalla = Pantalla(tipo, ancho, alto)
        # self.__pantalla = p  esta mal

    def agregaApp(self, app):  # metodo necesario para resolver el problema
        self.__apps.append(app)
        self.__cantApp += 1

    def getCantApp(self):
        return self.__cantApp

    def getModelo(self):
        return self.__modelo

    def setModelo(self, modelo):
        self.__modelo = modelo

    def setCantApp(self, cantApp):
        self.__cantApp = cantApp

    def setPantalla(self, pantalla):
        self.__pantalla = pantalla

    def getApps(self):
        return self.__apps

    def getPantalla(self):
        return self.__pantalla

    def __str__(self):
        return "Laptop{" + "modelo=" + self.__modelo + ", cantApp=" + str(self.__cantApp) + ", pantalla=" + str(self.__pantalla) + "}"