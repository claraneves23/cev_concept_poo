package aula05;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Dono:" + this.getDono());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Status:" + this.getStatus());
        System.out.println("Saldo:" + this.getSaldo());
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);

        if (tipo == "CC" || tipo == "cc") {
            this.setSaldo(50);
        }
        else if (tipo == "CP" || tipo == "cp") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");

    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        }
        else {
            this.setStatus (false);
        }
        System.out.println("Conta fechada com sucesso!");
    }

    public void depositar(double v) {

        if(this.getStatus()) {
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito feito na conta de " +this.getDono());
        }
        else {
            System.out.println("Erro fatal");
        }

    }

    public void sacar(double s) {
        if(this.getStatus()) {
            if (this.getSaldo() >= s)
            {
                this.setSaldo(this.getSaldo()-s);
                System.out.println("Saque feito na conta de " +this.getDono());
            }

            else
                System.out.println("Saldo insuficiente");
        }
        else {
            System.out.println("Erro fatal");
        }
    }

    public void pagarMensal() {
        double v = 0;

        if (this.getTipo() == "CC" || tipo == "cc")
            v = 12;
        else if (this.getTipo() == "CP" || tipo == "cp")
            v = 20;

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por" + this.getDono());
        } else {
            System.out.println("Erro fatal");
        }

    }

    public Banco() {

        this.setSaldo(0);
        this.setStatus(false);

    }


    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int nc) {
        this.numConta = nc;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tp) {
        this.tipo = tp;
    }

    public void setDono (String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus(){
        return this.status;
    }

}
