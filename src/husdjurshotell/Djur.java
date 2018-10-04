/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package husdjurshotell;


public abstract class Djur implements Portion {

    private String namn;
    private int vikt;
    private String foder;

   

    public Djur(String namn, int vikt,String foder) {
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

    @Override
    public int portion() {
        return vikt * 1000 / 100;
    }

    @Override
    public String typAvMat() {
        return foder;
    }
}
