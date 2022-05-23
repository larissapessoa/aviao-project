public class MotorTurbinado extends Motor {
    
    MotorTurbinado(String modelo, Float potencia){
        super(modelo, potencia);
    }

    public void ligar(){
        setAtivo(true);
        System.out.println("TRUMMMMMMM…");
    }
    
    public Float getPotencia(){
        Float novaPotencia = getPotencia() * 1.2F;
        setPotencia(novaPotencia);
        return getPotencia();
    }
}
