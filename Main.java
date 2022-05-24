class Main { 
    public static void main(String[] args) {
        
        //Laboratório 3
        
        Motor motor1 = new MotorTurbinado("50XABC", 50.0F);
        Motor motor2 = new MotorTurbinado("50XABC", 50.0F);
        
        Aviao aviao = new Aviao("Airbus A380", "Airbus A3XX ", motor1, motor2);

        TorreDeControle torreDeControle1 = new TorreDeControle("Torre ALFA");
        TorreDeControle torreDeControle2 = new TorreDeControle("Torre ÔMEGA");

        AguiaGigante aguiaGigante1 =  new AguiaGigante(1000F, "Gwaihir", 200F, true);
        AguiaGigante aguiaGigante2 =  new AguiaGigante(1000F, "Landroval" , 200F, true);
        
        Passageiro passageiro1 = new Passageiro("Dwight", "Scrhute", "45678913");
        Passageiro passageiro2 = new Passageiro("Michael", "Scott", "45678913");
        Passageiro passageiro3 = new Passageiro("Jim", "Halpert", "45678913");
        Passageiro passageiro4 = new Passageiro("Pam", "Beesly", "45678913");
        Passageiro passageiro5 = new Passageiro("Angela", "Martin", "45678913");
        
        aviao.addObserver(torreDeControle1);
        aviao.addObserver(torreDeControle2);

        aviao.adicionarPassageiro(passageiro1);
        aviao.adicionarPassageiro(passageiro2);
        aviao.adicionarPassageiro(passageiro3);
        aviao.adicionarPassageiro(passageiro4);
        aviao.imprimirListaDePassageiros();
        
        aviao.setMotorDireito(aguiaGigante1);
        aviao.setMotorEsquerdo(aguiaGigante2);
        
        aviao.ligarMotor();
        aviao.imprimeEstadoMotor();

        aviao.acelerar();
        aviao.acelerar();
        aviao.acelerar();
        aviao.adicionarPassageiro(passageiro5);
        aviao.imprimirListaDePassageiros();
        aviao.desligarMotorEspecifico(aguiaGigante1);
        aviao.imprimeEstadoMotor();
        
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.imprimeEstadoMotor();
        aviao.desligarMotor();
        aviao.getEstadoMotor();
    }
}
