class Main { 
    public static void main(String[] args) {

        /**Caso queira testar uma parte específica, comente o bloco das outras etapas */
        
        //Laboratório 2
        
        Motor motor1 = new MotorTurbinado("50XABC", 50.0F);
        Motor motor2 = new MotorTurbinado("50XABC", 50.0F);
        
        Aviao aviao = new Aviao("Airbus A380", "Airbus A3XX ", motor1, motor2);
        
        Passageiro passageiro1 = new Passageiro("Dwight", "Scrhute", "45678913");
        Passageiro passageiro2 = new Passageiro("Michael", "Scott", "45678913");
        Passageiro passageiro3 = new Passageiro("Jim", "Halpert", "45678913");
        Passageiro passageiro4 = new Passageiro("Pam", "Beesly", "45678913");
        Passageiro passageiro5 = new Passageiro("Angela", "Martin", "45678913");
        
        aviao.adicionarPassageiro(passageiro1);
        aviao.adicionarPassageiro(passageiro2);
        aviao.adicionarPassageiro(passageiro3);
        aviao.adicionarPassageiro(passageiro4);
        aviao.imprimirListaDePassageiros();

        aviao.ligarMotor();
        aviao.imprimeEstadoMotor();

        aviao.acelerar();
        aviao.acelerar();
        aviao.acelerar();
        aviao.adicionarPassageiro(passageiro5);
        aviao.imprimirListaDePassageiros();
        aviao.desligarMotorEspecifico(motor1);
        aviao.imprimeEstadoMotor();
        
        aviao.acelerar();
        aviao.desacelerar();
        aviao.imprimeEstadoMotor();
        aviao.desligarMotor();
        aviao.getEstadoMotor();
    }
}
