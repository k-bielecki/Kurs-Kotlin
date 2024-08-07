package Sekcja_25_Kotlin_vs_Java;

import main.kotlin.Sekcja_25_Kotlin_vs_Java.PlikKotlin;
import org.jetbrains.annotations.NotNull;

public class PlikJava {

    public static final String ZMIENNA_STATIC_FINAL = "STATIC FINAL";

    private int liczba;
    private String tekst;

    public void metodaNicNieZwraca() {
        PlikKotlin plikKotlin = new PlikKotlin();
        plikKotlin.funkcjaNicNieZwraca();

        String zmiennaVal = PlikKotlin.ZMIENNA_VAL;
        PlikKotlin.funkcjaCompanion();

        //plikKotlin.funkcjaZDomyslnymiParametrami();
    }
    @NotNull
    public String metodaCosZwraca() {
        return "coś";
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}
