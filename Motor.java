public class Motor implements Motorizavel {
    
    String modelo;
    Float potencia;
    boolean ativo;

    Motor(String modelo, Float potencia){
        setModelo(modelo);
        setPotencia(potencia);
        setAtivo(false);
    }

    public void ligar(){
        setAtivo(true);
        System.out.println("VRUMMMM!!");
    }

    public void desligar(){
        setAtivo(false);
        System.out.println("\nmmmmm……");
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPotencia() {
        return this.potencia;
    }

    public void setPotencia(Float potencia) {
        this.potencia = potencia;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public boolean getAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


}
