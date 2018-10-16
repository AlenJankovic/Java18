

package newbestgymever;


public class GymKund {
    
    private String namn;
    private String personNummer;
    private String år;
    private String månad;
    private String dag;
    
    
    public GymKund(String personNummer,String namn,String år,String månad,String dag){
        this.namn = namn;
        this.personNummer = personNummer;
        this.år = år;
        this.månad = månad;
        this.dag = dag;
        
    }
    
    public String getNamn(String namn){
        return namn;
    }
    public String getPersonNummer(String personNummer){
        return personNummer;
    }
    
    public String getÅr(String år){
        return år;
    }
    public String getMånad(String Månad){
        return månad;
    }
    public String getDag(String dag){
        return dag;
    }
}

