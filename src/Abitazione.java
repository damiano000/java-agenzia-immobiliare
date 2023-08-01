public class Abitazione extends Immobile{
    private int numVani;
    private int numBagni;
    public Abitazione(String codice, String indirizzo, int cap, String città, int superficie, int numBagni , int numVani) {
        super(codice, indirizzo, cap, città, superficie);
        this.numVani = numVani;
        this.numBagni = numBagni;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Abitazione" +
                "\nNumero vani: " + numVani +
                "\nNumero bagni: " + numBagni;
    }
}
