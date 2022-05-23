public class Passageiro {

    String primeiroNome;
    String ultimoNome;
    String Cpf;

    Passageiro(String primeiroNome, String ultimoNome, String Cpf){
        setPrimeiroNome(primeiroNome);
        setUltimoNome(ultimoNome);
        setCpf(Cpf);
    }

    Passageiro(String Cpf){
        setCpf(Cpf);
    }

    public String getPrimeiroNome() {
        return this.primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return this.ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getCpf() {
        return this.Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    
}
