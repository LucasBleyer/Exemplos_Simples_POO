package exemplo_4;

public class exemplo_4 {

    public static void main(String[] args) {
        ConverteTemperatura temp1 = new ConverteTemperatura();
        
        temp1.setGrausC(20);
        
        temp1.converteCelsiusParaFahrenheit();
        temp1.converteCelsiusParaKelvin();
        
        System.out.println( temp1.toString() );
    }
    
}