import java.sql.SQLOutput;
import java.util.Scanner;
public class desafio {
    public static void main(String[] args) {
                float valor=2500;
                System.out.println("Qual o nome do portador da conta? ");
                Scanner sc = new Scanner(System.in);
                String nome = sc.nextLine();
                System.out.println("""
                Dados iniciais do cliente:
                Nome:"""+nome+
                        """
                        \nTipo conta: Corrente
                        saldo inicial:R$ """+valor);
                System.out.println("""
                Operações
                1- Consultar saldos;
                2- Realizar um saque;
                3- Realizar um depósito;
                4- Sair.""");
                int x=0;
                do{
                    System.out.println("Qual a operação desejada? ");
                    int i = sc.nextInt();
                    x=i;
                    switch(i){
                        case 1:
                            System.out.println("Seu saldo é de: R$"+valor+".");
                            System.out.println("""
                \nOperações
                1- Consultar saldos;
                2- Realizar um saque;
                3- Realizar um depósito;
                4- Sair.""");
                            break;
                        case 2:
                            System.out.println("Qual o valor que gostaria de ser sacado? ");
                            float saque = sc.nextFloat();
                            if(saque<=valor){valor = valor-saque;}
                            else{
                                System.out.println("Impossível sacar um valor maior que o presente na conta.");
                            }
                            System.out.println("Valor atual: R$"+valor+".");
                            System.out.println("""
                \nOperações
                1- Consultar saldos;
                2- Realizar um saque;
                3- Realizar um depósito;
                4- Sair.""");
                            break;
                        case 3:
                            System.out.println("Qual o valor que gostaria de depositar? ");
                            float deposito = sc.nextFloat();
                            valor = valor+deposito;
                            System.out.println("valor atual: R$"+valor);
                            System.out.println("""
                \noperações
                1- Consultar saldos;
                2- Realizar um saque;
                3- Realizar um depósito;
                4- Sair.""");;
                        case 4:
                            System.out.println("Operação encerrada.");
                            break;
                        default:
                            System.out.println("Não existe essa operação.");
                            break;}

                }while(x!=4);
            }
        }


