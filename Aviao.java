class Aviao { 

    String modelo;
    String identificador;
    float altura;
    private float velocidade;
    private boolean emVoo;
    private Motor motorEsquerdo, motorDireito;

    public void imprimaOk() {
        System.out.println("OK!");
    }

    public void imprimaInfos() {
        System.out.printf("O modelo do avião é %s, com identificador %s e altura de %.2f metros. Motor ligado? %b", getModelo(),getIdentficador(),getAltura(), getEstadoMotor());
    }

    Aviao(String modelo, String identificador, Motor  motorEsquerdo, Motor motorDireito){
        setAltura(0.0F);
        setMotorEsquerdo(motorEsquerdo);
        setMotorDireito(motorDireito);
        this.modelo = modelo;
        this.identificador = identificador;
    }

    public void ligarMotor(){
        motorEsquerdo.ligar();
        motorDireito.ligar();
        System.out.println("\nVrummmmmmm");
    }

    public void desligarMotor(){
        motorEsquerdo.desligar();
        motorDireito.desligar();
        System.out.println("\nDesligando...");
    }

    
    public void ligarMotorEspecifico(Motor motor){
        motor.ligar();
        System.out.println("\nLigando um dos motores...");
    }

    
    public void desligarMotorEspecifico(Motor motor){
        motor.desligar();
        System.out.println("\nDesligando um dos motores...");
    }

    public void imprimeEstadoMotor(){
        if(motorDireito.ativo && motorEsquerdo.ativo){
            System.out.println("Os motores estão ligados!");
        }else{
            if(motorDireito.ativo){
                System.out.println("Somente o motor direito está ligado");
            }
            if(motorEsquerdo.ativo){
                System.out.println("Somente o motor esquerdo está ligado");
            }
            else{
                System.out.println("Os motores estão desligados...");
            }
        }
    }

    public boolean getEstadoMotor(){
        if (motorDireito.ativo || motorEsquerdo.ativo){
            return true;
        }else{
            return false;
        }
    }

    public void acelerar(){
        float somaPotencia = 0.0F;
        if(motorEsquerdo.ativo){
            float potenciaMotorEsquerdo = motorEsquerdo.potencia;
            somaPotencia =+ potenciaMotorEsquerdo;
        }
        if(motorDireito.ativo){
            float potenciaMotorDireito = motorDireito.potencia;
            somaPotencia =+ potenciaMotorDireito;
        }
        if (getEstadoMotor()){
            float novaVelocidade = getVelocidade() + somaPotencia;
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

    public Motor getMotorEsquerdo() {
        return this.motorEsquerdo;
    }

    public void setMotorEsquerdo(Motor motorEsquerdo) {
        this.motorEsquerdo = motorEsquerdo;
    }

    public Motor getMotorDireito() {
        return this.motorDireito;
    }

    public void setMotorDireito(Motor motorDireito) {
        this.motorDireito = motorDireito;
    }

}
