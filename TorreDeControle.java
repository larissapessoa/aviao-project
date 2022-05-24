import java.util.Observer;

import java.util.Observable;
import java.util.Observer;

public class TorreDeControle implements Observer {
    String identificador;

    TorreDeControle(String identificador){
        setIdentificador(identificador);
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void update(Observable obj, Object atualizaoStatus){
        String statusRecebido = atualizaoStatus.toString();
        System.out.printf("\n--> Torre Notificada: %s \n %s", getIdentificador(), statusRecebido);
    }

}
