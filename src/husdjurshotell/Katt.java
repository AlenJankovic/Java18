

package husdjurshotell;

public class Katt extends Djur {
    //Inkapslade variabler, kan nås i egna klassen men inte utanför
    private final int vikt;
    private final String foder;

    public Katt(String namn, int vikt, String foder) {
        super(namn, vikt, foder);

        this.vikt = vikt;
        this.foder = foder;
        
    }

    @Override
    public int portion() {
        return (vikt * 1000 / 150);
    }

    @Override
    public String typAvMat() {
        return foder;
    }
}
