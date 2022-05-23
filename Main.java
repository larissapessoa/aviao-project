class Main { 
    public static void main(String[] args) {

        /**Caso queira testar uma parte específica, comente o bloco das outras etapas */
        
        //Etapa 3 - Ajustando a fábrica de Aviões
        Aviao aviao = new Aviao("Airbus A380", "Airbus A3XX " );

        // Etapa 1 - Preparando a base de operações!
        aviao.imprimaOk();

        //Etapa 2 - Iniciando um avião básico
        aviao.imprimaInfos();

        //Etapa 4 - Testando o motor!
        aviao.ligarMotor();
        aviao.imprimeEstadoMotor();

        //Etapa 5 - Habilitando pousos e decolagens com velocidade
        aviao.acelerar();
        aviao.acelerar();
        aviao.desligarMotor();
        aviao.imprimeEstadoMotor();
        aviao.acelerar();
        aviao.ligarMotor();
        aviao.imprimeEstadoMotor();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desligarMotor();
        aviao.imprimeEstadoMotor();
        aviao.desacelerar();
 
        //Etapa 6 - Estou voando ou não?
        aviao.ligarMotor();
        aviao.imprimeEstadoMotor();
        aviao.acelerar();
        aviao.acelerar();
        aviao.acelerar();
        aviao.acelerar();
        aviao.acelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
        aviao.desacelerar();
    }
}
