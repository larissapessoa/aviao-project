public class AguiaGigante implements Motorizavel {
    
    Float peso;
    String nome;
    Float força;
    boolean acordada;

    AguiaGigante(Float peso, String nome, Float força, boolean acordada){
        setPeso(peso);
        setNome(nome);
        setForça(força);
        setAcordada(true);
    }

    public boolean getAtivo() {
        return getAcordada();
    }

    public Float getPotencia() {
        if(acordada){
            return getForça();
        }else {
            return 0F;
        }
    }

    public void ligar() {
        setAcordada(true);
        System.out.println("\nA-cor-da Pedrinhoooo");
    }

    public void desligar() {
        setAcordada(false);
        System.out.printf("\nA noite foi longa para %s", getNome());
    }

    private Float getPeso() {
        return this.peso;
    }

    private void setPeso(Float peso) {
        this.peso = peso;
    }

    private String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private Float getForça() {
        return this.força;
    }

    private void setForça(Float força) {
        this.força = força;
    }

    private boolean isAcordada() {
        return this.acordada;
    }

    private boolean getAcordada() {
        return this.acordada;
    }

    private void setAcordada(boolean acordada) {
        this.acordada = acordada;
    }

}
