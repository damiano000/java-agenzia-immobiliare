public class Villa extends Abitazione {
    private int superficieGiardino;

    public Villa(String codice, String indirizzo, int cap, String città, int superficie, int numBagni, int numVani, int superficieGiardino) {
        super(codice, indirizzo, cap, città, superficie, numBagni, numVani);
        this.superficieGiardino = superficieGiardino;
    }


    @Override
    public String toString() {
        return super.toString() + "\nTipo: Villa" +
                "\nSuperficie giardino: " + superficieGiardino;
    }
}
