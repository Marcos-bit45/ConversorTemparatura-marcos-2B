public class Temperatura {
    //ATRIBUTO  PRIVADO PARA ARMAZENAR TEMP - CELSIUS
    private double tempCelsius;
    
    //CONSTRUTOR 
    public Temperatura(double tempInicialCelsius){
        this.tempCelsius = tempInicialCelsius;
    }
    
    //GETTER - PARA LER A TEMPARATURA 
    public double getTemperaturaCelsius(){
    return tempCelsius;
    }
    
    //SETTER - PARA MUDAR A TEMPARATURA
    public void settemparaturaCelcius(double mudarTempCelsius){
        this.tempCelsius = mudarTempCelsius;     
    }
    
    //MÉTODO PARA CONVERTER CELSIUS PARA FAHRENHEIT
    public double converterParaFahrenheit(){
        return (tempCelsius*9/5)+32;
    }
    
    //MÉTODO PARA CONVERTER CELSIUS PARA  KELVIN
    public double converterParaKelvin(){
        return tempCelsius+273.15;
    }
            
}
