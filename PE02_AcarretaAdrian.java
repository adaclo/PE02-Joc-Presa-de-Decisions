package Activitats.PE02;

import java.util.Scanner;

public class PE02_AcarretaAdrian {
    public static void main(String[] args) {
        // DECLARACIO DE VARIABLES
        boolean alarmClock = false;
        boolean pillow = false;
        boolean knife = false;
        boolean medkit = false;
        boolean shotgun = false;
        boolean radio = false;
        boolean paranoia = false;
        boolean hungry = false;
        boolean wounds = false;
        boolean sick = false;
        String var;
        Scanner e = new Scanner(System.in);

        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("--- Un joc de: Adrián Acarreta ---");
        System.out.println("-- PE-02 Joc Presa de Decisions --");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println("Ha començat l'alarma nuclear a tot el país, però per sort l'any passat vas instal·lar un búnquer nuclear al teu soterrani, tens poc temps, actua amb cap.");
        System.out.println("");
        System.out.println("Calcules que només tens temps per agafar 2 coses de casa teva abans que arribi la radiació.");
        System.err.println("");
        System.out.println("Estàs a la teva habitació i has d'agafar només una cosa...");
        System.out.println("- Què vols agafar?");
        System.out.println("  (1) Rellotge despertador");
        System.out.println("  (2) Coixí");
        var = e.next();

        switch(var) {
            case "1", "rellotge", "Rellotge":
                alarmClock = true;
                System.out.println("");
                System.out.println("(+) Has agafat Rellotge despertador!");
                System.out.println("");
                break;
            case "2", "coixi", "Coixi":
                pillow = true;
                System.out.println("");
                System.out.println("(+) Has agafat Coixí!");
                System.out.println("");
                break;
            default:
                System.out.println("");
                System.err.println("(!) Valor introduït invàlid");
                System.out.println("");
        }

        System.out.println("Te'n recordes que vas deixar algunes provisions a dins del búnquer i vas corrent cap a la cuina per agafar més coses que t'ajudin...");
        System.out.println("- Què vols agafar?");
        System.out.println("  (1) Ganivet");
        System.out.println("  (2) Farmaciola");
        var = e.next();

        switch(var) {
            case "1", "ganivet", "Ganivet":
                knife = true;
                System.out.println("");
                System.out.println("(+) Has agafat Ganivet!");
                System.out.println("");
                break;
            case "2", "farmaciola", "Farmaciola":
                medkit = true;
                System.out.println("");
                System.out.println("(+) Has agafat Farmaciola!");
                System.out.println("");
                break;
            default:
                System.out.println("");
                System.err.println("(!) Valor introduït invàlid");
                System.out.println("");
        }
        System.out.println("Estàs dubtós si necessites alguna cosa més, però no estàs segur d'arribar a temps al búnquer...");
        System.out.println("- T'arrisques per un tercer objecte o t'amagues al búnquer?");
        System.out.println("  (1) Arriscar-te i anar al saló per un altre objecte");
        System.out.println("  (2) Amagar-te al búnquer");
        System.out.println("");
        var = e.next();
        switch (var) {
            case "1":
                System.out.println("- Què vols agafar?");
                System.out.println("  (1) Escopeta");
                System.out.println("  (2) Radio");
                var = e.next();

                switch(var) {
                    case "1", "escopeta", "Escopeta":
                        shotgun = true;
                        System.out.println("");
                        System.out.println("(+) Has agafat Escopeta!");
                        System.out.println("");
                        break;
                    case "2", "radio", "Radio":
                        radio = true;
                        System.out.println("");
                        System.out.println("(+) Has agafat Radio!");
                        System.out.println("");
                        break;
                    default:
                        System.out.println("");
                        System.err.println("(!) Valor introduït invàlid");
                        System.out.println("");
                }
                sick = true; // La radiació t'afecta
                System.out.println("");
                System.out.println("Surts del saló i entres al búnquer, però et trobes una mica malament");
                System.err.println("");
                break;
            case "2":
                System.out.println("");
                System.out.println("Entres corrent al búnquer");
                System.out.println("");
                break;
            default:
                System.out.println("");
                System.err.println("(!) Valor introduït invàlid");
                System.out.println("");
                break;
        }

        
        
    }
}
