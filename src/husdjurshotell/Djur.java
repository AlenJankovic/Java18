

package husdjurshotell;

public abstract class Djur implements Portion {
    //Inkapslade variabler, kan nås i egna klassen men inte utanför
    private final  String namn;
    private final int vikt;
    private final String foder;

    public Djur(String namn, int vikt, String foder) {
        this.namn = namn;
        this.vikt = vikt;
        this.foder = foder;
    }

    public String getNamn() {
        return namn;
    }

    public int getVikt() {
        return vikt;
    }

    public String getFoder() {
        return foder;
    }

   
}
