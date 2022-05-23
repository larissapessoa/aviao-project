class Aviao { 

    String modelo;
    String identificador;
    boolean motor;
    float altura;
    private float velocidade;
    private boolean emVoo;

    // Etapa 1 - Preparando a base de operações!
    public void imprimaOk() {
        System.out.println("OK!");
    }

    // Etapa 2 - Iniciando um avião básico
    public void imprimaInfos() {
        System.out.printf("O modelo do avião é %s, com identificador %s e altura de %.2f metros. Motor ligado? %b", getModelo(),getIdentficador(),getAltura(), getMotor());
    }

    // Etapa 3 - Ajustando a fábrica de Aviões
    Aviao(String modelo, String identificador){
        setAltura(0.0F);
        setMotor(false);
        this.modelo = modelo;
        this.identificador = identificador;
    }

    // Etapa 4 - Testando o motor!
    public void ligarMotor(){
        setMotor(true);
        System.out.println("\nVrummmmmmm");
    }

    public void desligarMotor(){
        setMotor(false);
        System.out.println("\nDesligando...");
    }

    public void imprimeEstadoMotor(){
        if(getMotor()){
            System.out.println("O motor esta ligado!");
        }else{
            System.out.println("O motor esta desligado...");
        }
    }

    //Etapa 5 - Habilitando pousos e decolagens com velocidade
    public boolean getEstadoMotor(){
        return getMotor();
    }

    public void acelerar(){
        float num = 50.0F;
        if (getEstadoMotor()){
            float novaVelocidade = getVelocidade() + num;
            setVelocidade(novaVelocidade);
            System.out.printf("\nAviao a %.2f km/h", getVelocidade());
        }else{
            System.out.println("ERRO: Motor desligado!");
        }
        atualizarStatusVoo();
    }

    public void desacelerar(){
        float num = 50.0F;
        if (getEstadoMotor()){
            if( getVelocidade() > 0){
                float novaVelocidade = getVelocidade() - num;
                setVelocidade(novaVelocidade);
            }
            System.out.printf("\nAviao a %.2f km/h", getVelocidade());
        }else{
            System.out.println("ERRO: Motor desligado!");
        }
        atualizarStatusVoo();
    }

    //Etapa 6 - Estou voando ou não?
    public void atualizarStatusVoo(){
        if(getEmVoo()){
            if(getVelocidade() >= 200){
                System.out.println("Estou voando...");
            }else{
                setEmVoo(false);
                System.out.println("Estou aterrisando..."); 
            }
        }else{
            if(getVelocidade() < 200){
                System.out.println("Estou em solo...");
            }else{
                setEmVoo(true);
                System.out.println("Estou decolando...");
            }
        }
    }


    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getIdentficador() {
        return this.identificador;
    }

    public void setIdentficador(String identficador) {
        this.identificador = identficador;
    }

    public boolean isMotor() {
        return this.motor;
    }

    public boolean getMotor() {
        return this.motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getVelocidade() {
        return this.velocidade;
    }

    private void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public boolean getEmVoo() {
        return this.emVoo;
    }

    private void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

}
