import java.util.Objects;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public void estadoAtualConta(){
        System.out.println("------------------------------------");
        System.out.println("conta Número: " + this.getNumConta());
        System.out.println("Títular : " + this.getDono());
        System.out.println("Tipo :" + this.getTipo());
        System.out.println("Saldo de R$" + this.getSaldo());
        System.out.println("Status :" + this.getStatus());
        System.out.println("------------------------------------");
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if (Objects.equals(t, "CC")){
            tipo = "CC";
            this.setSaldo(50);
        }
        else if (Objects.equals(t, "CP")){
            tipo ="CP";
            this.setSaldo(150);
        }

    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Vôce tem que sacar o valor de " + this.saldo + " antes de fechar a conta." );
        }
        else if(this.getSaldo() < 0){
            System.out.println("Sua conta está em débito de: " + this.saldo + "Reais.");
        }
        else {
            status = false;
            System.out.println("Sua conta de número:" + this.numConta + " foi fechada com sucesso!");
        }
    }

    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(getSaldo() + v);
        }
        else {
            System.out.println("ERRO CONTA FECHADA!");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
            }
            else{
                System.out.println("Saldo insuficiente para saque.");
            }
        }
        else {
            System.out.println("ERRO CONTA FECHADA!");
        }
    }

    public void pagarConta(float i){
        if (Objects.equals(this.getTipo(), "CC")){
            i = 12;
        }
        else if (Objects.equals(this.getTipo(), "CP")){
            i = 20;
        }

        if (this.getStatus()){
            if (this.getSaldo() > i){
                setSaldo(getSaldo() - i);
            }
            else {
                System.out.println("Saldo insuficiente para cobrança de serviços");
                setSaldo(getSaldo() - i);
                System.out.println("Seu débito é de: " + this.saldo + "Reais.");
            }
        }
        else {
            System.out.println("ERRO CONTA FECHADA!");
        }
    }

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

}