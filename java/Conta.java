import java.util.Scanner;
public class Conta {
    Scanner sc=new Scanner(System.in);
    private float saldo;
    public void depositar() {
        System.out.println("qual o valor que gostaria de depositar?");
        float valor=sc.nextFloat();
        if(valor<0){
            System.out.println("deixa de ser otario");
        }
        else{
        saldo=saldo+valor;
            System.out.println(saldo);
    }}
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
