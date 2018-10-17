

package newbestgymever;


public class GymKund {
    
    protected String namn;
    protected String personNummer;
    protected String år;
    protected String månad;
    protected String dag;
    
    
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
    public String getMånad(String månad){
        return månad;
    }
    public String getDag(String dag){
        return dag;
    }

    
   
}

