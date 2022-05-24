import java.util.ArrayList;

class Aviao { 

    String modelo;
    String identificador;
    float altura;
    ArrayList<Passageiro> ListaPassageiros;
    private float velocidade;
    private boolean emVoo;
    private Motorizavel motorEsquerdo, motorDireito;

    public void imprimaOk() {
        System.out.println("OK!");
    }

    public void imprimaInfos() {
        System.out.printf("O modelo do avião é %s, com identificador %s e altura de %.2f metros. Motor ligado? %b", getModelo(),getIdentficador(),getAltura(), getEstadoMotor());
    }

    Aviao(String modelo, String identificador, Motorizavel  motorEsquerdo, Motorizavel motorDireito){
        setAltura(0.0F);
        setMotorEsquerdo(motorEsquerdo);
        setMotorDireito(motorDireito);
        this.modelo = modelo;
        this.identificador = identificador;
        this.ListaPassageiros = new ArrayList<Passageiro>();
    }

    public void ligarMotor(){
        motorEsquerdo.ligar();
        motorDireito.ligar();
        System.out.println("\nVrummmmmmm");
    }

    public void desligarMotor(){
        motorEsquerdo.desligar();
        motorDireito.desligar();
        System.out.println("\nDesligando todos os motores...");
    }

    
    public void ligarMotorEspecifico(Motor motor){
        motor.ligar();
        System.out.println("\nLigando um dos motores...");
    }

    
    public void desligarMotorEspecifico(Motorizavel motor){
        motor.desligar();
        System.out.println("\nDesligando um dos motores");
    }

    public void imprimeEstadoMotor(){
        if((motorDireito.getAtivo() == true) && (motorEsquerdo.getAtivo() == true)){
            System.out.println("\nOs motores estão ligados!");
        }else{
            if(motorDireito.getAtivo()){
                System.out.println("\nSomente o motor direito está ligado");
            }
            if(motorEsquerdo.getAtivo()){
                System.out.println("\nSomente o motor esquerdo está ligado");
            }
            if((motorDireito.getAtivo() == false) && (motorEsquerdo.getAtivo() == false)){
                System.out.println("\n Os motores estão desligados...");
            }
        }
    }

    public boolean getEstadoMotor(){
        if (motorDireito.getAtivo() || motorEsquerdo.getAtivo()){
            return true;
        }else{
            return false;
        }
    }

    public void acelerar(){
        float somaPotencia = 0.0F;
        if(motorEsquerdo.getAtivo()){
            float potenciaMotorEsquerdo = motorEsquerdo.getPotencia();
            somaPotencia =+ potenciaMotorEsquerdo;
        }
        if(motorDireito.getAtivo()){
            float potenciaMotorDireito = motorDireito.getPotencia();
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

    public boolean adicionarPassageiro(Passageiro passageiro){
        if (getVelocidade() == 0){
            ListaPassageiros.add(passageiro);
            return true;
        } else{
            System.out.println("Protocolos de segurança não permitem embarques com a aeronave em movimento");
            return false;
        }
    }

    public Passageiro buscarPassageiroPorCPF(String cpf){
        for ( int i = 0; i <= ListaPassageiros.size(); i++){
            if (ListaPassageiros.get(i).getCpf() == cpf){
                return ListaPassageiros.get(i);
            }
        }
        return null;
    }

    public void imprimirListaDePassageiros(){
        System.out.println("**** Lista de Passageiros (as) ****");
        for ( int i = 0; i < ListaPassageiros.size(); i++){
            System.out.printf("Nome completo: %s %s, CPF: %s \n", ListaPassageiros.get(i).getPrimeiroNome(), ListaPassageiros.get(i).getUltimoNome(), ListaPassageiros.get(i).getCpf());
        }
    }

    public void desembarcarPassageiros(){
        if (getVelocidade() == 0){
            for ( int i = 0; i <= ListaPassageiros.size(); i++){
                ListaPassageiros.remove(ListaPassageiros.get(i));
                System.out.printf("%s %s desembarcou da aeronave! \n", ListaPassageiros.get(i).getPrimeiroNome(), ListaPassageiros.get(i).getUltimoNome());
            }
        } else{
            System.out.println("Protocolos de segurança não permitem embarques com a aeronave em movimento");
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

    public Motorizavel getMotorEsquerdo() {
        return this.motorEsquerdo;
    }

    public void setMotorEsquerdo(Motorizavel motorEsquerdo) {
        this.motorEsquerdo = motorEsquerdo;
    }

    public Motorizavel getMotorDireito() {
        return this.motorDireito;
    }

    public void setMotorDireito(Motorizavel motorDireito) {
        this.motorDireito = motorDireito;
    }

}
