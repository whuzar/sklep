import java.util.Scanner;

public class samochod extends Klasa {
    samochod(String nazwa, double cena) {
        super(nazwa, cena);
    }
    public static void main(String[] args) {
        Klasa p1 = new Klasa("ser", 10.51);
        Klasa p2 = new Klasa("mleko", 2.99);
        Klasa p3 = new Klasa("czekolada", 2.39);
        Klasa p4 = new Klasa("chipsy", 3.99);
        Klasa p5 = new Klasa("papier", 2.99);
        Klasa p6 = new Klasa("platki", 2.39);
        Klasa p7 = new Klasa("baton", 2.12);
        Klasa p8 = new Klasa("wendlina", 2.99);
        Klasa p9 = new Klasa("jablko", 2.39);
        Klasa p10 = new Klasa("sok", 2.66);
        Klasa p11 = new Klasa("maslo", 2.99);
        Klasa p12 = new Klasa("przyprawa", 2.39);
        Klasa p13 = new Klasa("jajka", 1.99);
        Klasa p14 = new Klasa("jogurt", 2.99);
        String[] tablica = new String[14];
        String slowo;
        int ilosc;
        System.out.println("Wybierz produkty z pośród tych: ser, mleko, czekolada, chipsy, papier, platki, baton, wendlina, jablko, sok, maslo, przyprawa, jajka, jogurt" );
        System.out.println("Jeżeli już będziesz miał wszystko to napisz 'koniec'(maksymalnie 20 produktów)");
        Scanner scan = new Scanner(System.in);
        String[] tab2 = new String[]{p1.n, p2.n, p3.n, p4.n ,p5.n, p6.n, p7.n, p8.n ,p9.n ,p10.n ,p11.n ,p12.n, p13.n, p14.n};
        double[] tab3 = new double[]{p1.c, p2.c, p3.c, p4.c ,p5.c, p6.c, p7.c, p8.c ,p9.c ,p10.c ,p11.c ,p12.c, p13.c, p14.c};
        double kwota = 0;
        int ile = 0;
        for(int i = 0; i <tablica.length; i++) {
            int cos = 0;
            System.out.println("Podaj produkt:");
            slowo = scan.next();
            if (slowo.equals("koniec")) break;
            for(int j=0; j<tab2.length; j++){
                if(slowo.equals(tab2[j])){
                    System.out.println("Liczba sztuk(minimalna wartość to 1)");
                    ilosc = scan.nextInt();
                    ile++;
                    if (ilosc <= 0) {
                        System.out.println("Podaj wartości ponownie");
                        break;
                    }
                    tablica[i] = slowo + ", ilość sztuk produktu: " + ilosc;
                    kwota += (ilosc * tab3[j]);
                    j = 15;
                }else {
                    cos++;
                }
            }
            if(cos == tab2.length){
                System.out.println("Podales nie poprawny produkt, podaj jeszcze raz");
                i--;
            }
        }
        System.out.println("W twoim koszyku znajduje się: ");
        for(int x =0; x < ile; x++){
            System.out.print(" - ");
            System.out.println(tablica[x]);
        }

        System.out.format("%.2f%n",kwota);

    }
}