/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package husdjurshotell;

import javax.swing.JOptionPane;


public class Katt extends Djur {

    private int vikt;
    private String foder;

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
