public class Main {
    public static void main(String[] args) {
        AgenziaImmobiliare agenzia = new AgenziaImmobiliare();

        // Aggiunta di immobili di prova

        Box box = new Box("B001", "Via Roma 1", 20100, "Milano", 20 , 10);
        Abitazione abitazione = new Abitazione("A001", "Via Venezia 5", 20121, "Milano", 80, 2, 1);
        Villa villa = new Villa("V001", "Via dei Pini 10", 20090, "Milano", 150,  3, 200, 100);
        agenzia.aggiungiImmobile( box);
        agenzia.aggiungiImmobile( abitazione );
        agenzia.aggiungiImmobile(villa);



        System.out.println("Ricerca immobile, inserisci il codice :");
        Immobile ricercaImmobile = agenzia.ricercaImmobile("Haaaa");
        if (ricercaImmobile != null) {
            System.out.println(ricercaImmobile.toString());
        } else {
            System.out.println("Immobile da trovare non riuscito");
        }


        System.out.println("Ricerca immobile con maggior numero di interesse: ");
        box.incrementoPers();
        abitazione.incrementoPers();
        villa.incrementoPers();
        villa.incrementoPers();

        Immobile likeImmobile = agenzia.immobileConMaxPersoneInteressate();
        if (likeImmobile != null) {
            System.out.println(likeImmobile.toString());
        } else {
            System.out.println("Immobile non interesse");
        }
    }
        }
