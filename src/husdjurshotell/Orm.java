

package husdjurshotell;

public class Orm extends Djur {
    //Inkapslade variabler, kan nås i egna klassen men inte utanför
    private final String foder;
    private final int ormPortion;

    public Orm(String namn, int vikt, String foder, int ormPortion) {
        super(namn, vikt, foder);
        this.foder = foder;
        this.ormPortion = ormPortion;
       
    }
    
    @Override
    public String typAvMat() {
        return foder;
    }

    @Override
    public int portion() {
        return ormPortion;
    }

}
