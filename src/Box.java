public class Box extends Immobile{
    private int numPostiAuto;

    public Box(String codice, String indirizzo, int cap, String città, int superficie, int numPostiAuto) {
        super(codice, indirizzo, cap, città, superficie);
        this.numPostiAuto = numPostiAuto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Box" +
                "\nNumero posti auto:" + numPostiAuto;
    }
}
