/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package husdjurshotell;

public class Orm extends Djur {

    private String foder;
    private int ormPortion;

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
