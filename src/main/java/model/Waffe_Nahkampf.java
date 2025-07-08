package model;

public class Waffe_Nahkampf extends Gegenstand {

    private String waffentyp;
    private String tp;
    private String l_s;
    private String at_pa_mod;
    private String rw;
    private int laenge;

    private Waffe_Nahkampf(String w, String t, String ls, String apm, String r, int l) {
        waffentyp = w;
        tp = t;
        l_s = ls;
        at_pa_mod = apm;
        rw = r;
        laenge = l;
    }

    public void create_Waffe_Nahkampf(String w, String t, String ls, String apm, String r, int l) {
        // Fabrikmethode, falls die Daten später noch vor dem Erstellen formatiert werden sollen
        new Waffe_Nahkampf(w, t, ls, apm, r, l);
    }
}
