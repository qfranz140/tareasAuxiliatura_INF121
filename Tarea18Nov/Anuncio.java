public class Anuncio {
    public int numero;
    public double precio;

    public Anuncio() {
        this.numero = 0;
        this.precio = 0.1;
    }

    public Anuncio(int num, double pre) {
        this.numero = num;
        this.precio = pre;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }
}

class Artista {
    public String nombre;
    public int ci;
    public int aniosExp;

    public Artista(String nom, int car, int anios) {
        this.nombre = nom;
        this.ci = car;
        this.aniosExp = anios;
    }

    public int getAnios() {
        return aniosExp;
    }

    public String getNombre() {
        return nombre;
    }
}

class Obra {
    public String titulo;
    public String material;
    public Artista artista1;
    public Artista artista2;
    public Anuncio anuncio;

    public Obra(String titulo, String material, String nom1, int car1, int anio1, String nom2, int car2, int anio2) {
        this.titulo = titulo;
        this.material = material;
        this.artista1 = new Artista(nom1, car1, anio1);
        this.artista2 = new Artista(nom2, car2, anio2);
        this.anuncio = null;
    }

    public void agregarAnuncio(Anuncio anun) {
        this.anuncio = anun;
    }

    public Artista getArt1() {
        return artista1;
    }

    public Artista getArt2() {
        return artista2;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public Artista artistaMayorExp() {
        if (artista1.getAnios() >= artista2.getAnios()) {
            return artista1;
        }
        return artista2;
    }
}

class Pintura extends Obra {
    public String genero;

    public Pintura(String titulo, String material, String nom1, int car1, int anio1, String nom2, int car2, int anio2, String gen) {
        super(titulo, material, nom1, car1, anio1, nom2, car2, anio2);
        this.genero = gen;
    }
}