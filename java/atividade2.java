
    import java.util.Scanner;
    public class atividade2 {
        public static void main(String[] args) {
            int x=0;
            Scanner sc=new Scanner(System.in);
            while(x==0){
                System.out.println("qual a questão que o professor gostaria de analisar?");
                int i = sc.nextInt();
                switch (i){
                    case 1:
                        System.out.println("qual o número irá ser analisado?");
                        float num= sc.nextFloat();
                        if(num<0){
                            System.out.println("o número é negativo");
                        } else if (num==0) {
                            System.out.println("o número é nulo");
                        }
                        else {
                            System.out.println("o número é positivo");
                        }
                        break;
                    case 2:
                        System.out.println("quais os números a serem analisados?");
                        int nume1 = sc.nextInt();
                        int nume2 = sc.nextInt();
                        if(nume1>nume2 && nume1!=nume2){
                            System.out.println(nume1+" é o maior número e eles são números diferentes");
                        }
                        else if (nume2>nume1 && nume2!=nume1) {
                            System.out.println(nume2+" é o maior número e eles são números diferentes");
                        }
                        else{
                            System.out.println("os números são iguais");
                        }
                        break;
                    case 3:
                        System.out.println("selecione 1 para calcular a área de um círculo ou 2 para calcular a área do quadrado");
                        int j=sc.nextInt();
                        switch (j){
                            case 1:
                                System.out.println("qual o raio do círculo em cm?");
                                float ra=sc.nextFloat();
                                System.out.println("a área é de "+ra*ra*3.14159265359+" cm²");
                                break;
                            case 2:
                                System.out.println("qual o lado do quadrado em cm?");
                                float la=sc.nextFloat();
                                System.out.println("a área é de "+la*la+" cm²");
                                break;
                        }
                    case 4:
                        System.out.println("qual o número que você quer saber a taboada?");
                        int tabu= sc.nextInt();
                        for(int k=0;k<=10;k++){
                            System.out.println(tabu+"*"+k+"="+tabu*k);
                        }
                    case 5:
                        System.out.println("qual o número irá ser analisado?");
                        float pi= sc.nextFloat();
                        if(pi%2==0){
                            System.out.println("o número é par");
                        }
                        else {
                            System.out.println("o número é ímpar");
                        }
                    case 6:
                        System.out.println("qual o número que você quer saber o fatorial?");
                        int fato= sc.nextInt();
                        int m;
                        m=fato;
                        for(int l=fato;l>0;l=l-1){
                            m *= l;
                        }
                        if(m>0){System.out.println(m/fato);}
                        else if(m==0){
                            System.out.println(1);
                        }
                        else{
                            System.out.println("impossível realizar a operação");
                        }
                        break;
                    default:
                        System.out.println("essa questão não existe");
                }
            }}

    }
