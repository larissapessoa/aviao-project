class Main { 
    public static void main(String[] args) {

        /**Caso queira testar uma parte específica, comente o bloco das outras etapas */
        
        //Laboratório 2
        
        Motor motor1 = new Motor("50XABC", 50.0F);
        Motor motor2 = new Motor("50XABC", 50.0F);
        Aviao aviao = new Aviao("Airbus A380", "Airbus A3XX ", motor1, motor2 );
        aviao.ligarMotor();
        aviao.imprimeEstadoMotor();
        aviao.acelerar();
        aviao.desligarMotorEspecifico(motor1);
        aviao.imprimeEstadoMotor();
        aviao.acelerar();
        aviao.desacelerar();
        aviao.imprimeEstadoMotor();
        aviao.desligarMotor();
        aviao.getEstadoMotor();
    }
}
