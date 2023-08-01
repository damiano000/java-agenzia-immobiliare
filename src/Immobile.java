public class Immobile {
        private String codice;
        private String indirizzo;
        private int cap;
        private String città;
        private int superficie;
        private int numPersoneInteressate;

           public Immobile(String codice, String indirizzo, int cap, String città, int superficie) {
               this.codice = codice;
               this.indirizzo = indirizzo;
               this.cap = cap;
               this.città = città;
               this.superficie = superficie;
               this.numPersoneInteressate = 0;
           }


           //metodi e attributi
           public void incrementoPers() {
               this.numPersoneInteressate++;
           }
           public void reimpostaSuperfici(int nuovasuperficie) {
               this.superficie = nuovasuperficie;
           }

    @Override
    public String toString() {
        return "Immobile{" +
                "codice='" + codice + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap=" + cap +
                ", città='" + città + '\'' +
                ", superficie=" + superficie +
                ", numPersoneInteressate=" + numPersoneInteressate +
                '}';
    }

    public String getCodice() {
        return codice;
    }

    public int getNumPersoneInteressate() {
        return numPersoneInteressate;
    }

}


