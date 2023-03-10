public class PERSONA {
    private String SEXO;
    private int EDAD;
    
    public PERSONA(String SEXO, int EDAD){
        this.SEXO=SEXO;
        this.EDAD=EDAD;
    }
        
    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }
    @Override
    public String toString(){
        return SEXO + "," + EDAD;
    }
}
