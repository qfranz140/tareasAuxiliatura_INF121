from laptop import Laptop
from aplicacion import Aplicacion


class Main:
    @staticmethod
    def main():
        # INCISO A
        vec = []
        print("=== INCISO A ===")
        print("N:")
        n = int(input())
        for i in range(n):
            print("Laptop " + str(i + 1))
            print("Modelo:")
            modelo = input()
            print("Cantidad de apps:")
            cantApp = int(input())
            print("Tipo de pantalla:")
            tipo = input()
            print("Ancho:")
            ancho = int(input())
            print("Alto:")
            alto = int(input())
            vec.append(Laptop(modelo, cantApp, tipo, ancho, alto))

        # inciso b
        print("=== INCISO B: laptop con mas apps ===")
        may = 0
        for l in vec:
            if l.getCantApp() > may:
                may = l.getCantApp()
        for l in vec:
            if l.getCantApp() == may:
                print(l)

        # inciso c
        print("=== INCISO C: agregar app a la laptop de modelo X ===")
        print("Modelo X:")
        x = input()
        print("Nombre de la app:")
        nom = input()
        print("Tamanio de la app:")
        tam = int(input())
        for laptop in vec:
            if laptop.getModelo() == x:
                laptop.agregaApp(Aplicacion(nom, tam))

        # inciso d
        print("=== INCISO D: eliminar apps de laptops con pantalla de ancho Y ===")
        print("Ancho Y:")
        y = int(input())
        for laptop in vec:
            if laptop.getPantalla().getAncho() == y:
                laptop.getApps().clear()
                laptop.setCantApp(len(laptop.getApps()))

        # inciso e
        print("=== INCISO E: laptop con mas apps ===")
        mayor = 0
        for l in vec:
            if l.getCantApp() > mayor:
                mayor = l.getCantApp()
        for l in vec:
            if l.getCantApp() == mayor:
                print(l)

        # inciso f
        print("=== INCISO F: apps ordenadas de cada laptop ===")
        for laptop in vec:
            lista = laptop.getApps()
            for i in range(len(lista) - 1):
                for j in range(len(lista) - 1 - i):
                    a = lista[j]
                    b = lista[j + 1]
                    if a.getTamanio() < b.getTamanio() or (a.getTamanio() == b.getTamanio() and a.getNombre() > b.getNombre()):
                        lista[j] = b
                        lista[j + 1] = a
            print(laptop)
            for app in lista:
                print(app)


Main.main()