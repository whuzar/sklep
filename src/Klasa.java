class Klasa extends Cart {
    String n;
    double c;
    Klasa(String nazwa, double cena) {
        this.n = nazwa;
        this.c = cena;
    }
    public String toString (){
        return this.n + this.c;
    }
}
