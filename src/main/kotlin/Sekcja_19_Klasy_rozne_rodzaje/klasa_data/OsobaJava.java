package Sekcja_19_Klasy_rozne_rodzaje.klasa_data;

import java.util.Objects;

class OsobaJava {
    private String imie;
    private String nazwisko;

    public OsobaJava(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "OsobaJava(" + imie + ", " + nazwisko + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OsobaJava osobaJava)) return false;
        return Objects.equals(imie, osobaJava.imie) && Objects.equals(nazwisko, osobaJava.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }

    public static void main(String[] args) {
        OsobaJava osoba1 = new OsobaJava("Jan", "Kowalski");
        OsobaJava osoba2 = new OsobaJava("Jan", "Kowalski");

        System.out.println(osoba1);
        System.out.println(osoba1.equals(osoba2));
    }
}
