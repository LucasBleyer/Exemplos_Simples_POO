package exemplo_4;

public class ConverteTemperatura {
    private float grausC;
    private float grausF;
    private float grausK;

//construtores
    public ConverteTemperatura() {
    }
    
    public ConverteTemperatura(float grausC, float grausF) {
        this.grausC = 0;
        this.grausF = 0;
    }

//getters e setters
    public float getGrausC() {
        return grausC;
    }

    public void setGrausC(float grausC) {
        this.grausC = grausC;
    }

    public float getGrausF() {
        return grausF;
    }

    public void setGrausF(float grausF) {
        this.grausF = grausF;
    }

    public float getGrausK() {
        return grausK;
    }

    public void setGrausK(float grausK) {
        this.grausK = grausK;
    }

//funções de conversão de temperatura    
    public void converteCelsiusParaFahrenheit(){
        this.grausF = (this.grausC * 9 / 5) + 32;
    }
    
    public void converteCelsiusParaKelvin(){
        this.grausK = this.grausC + 273.15f;//f para dizer que é float
    }

    @Override
    public String toString() {
        return "Temperatura{" + "grausC=" + grausC + ", grausF=" + grausF + ", grausK=" + grausK + '}';
    }   
}