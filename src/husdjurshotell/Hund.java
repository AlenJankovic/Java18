

package husdjurshotell;

public class Hund extends Djur {
    //Inkapslade variabler, kan användas i egna klassen men inte utanför
    private final int vikt;
    private final String foder;
    
    public Hund(String namn, int vikt, String foder) {
        super(namn, vikt, foder);
        this.vikt = vikt;
        this.foder = foder;
        
       
    }

    @Override
    public int portion() {
        return (vikt * 1000 / 100);
    }

    @Override
    public String typAvMat() {
        return foder;
    }

}
