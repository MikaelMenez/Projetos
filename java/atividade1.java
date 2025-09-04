import java.util.Scanner;
public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y=0;
        while(y==0) {
            System.out.println("qual a questão que o professor gostaria de analisar ?");
            Scanner x = new Scanner(System.in);
            int i = x.nextInt();
            switch (i) {
                case 6:
                    System.out.println("qual o raio da circunferência?");
                    Scanner ra = new Scanner(System.in);
                    float raiop = ra.nextFloat();
                    System.out.println("o perímetro da circunferência é de :" + raiop * 2 * 3.14159265359);
                    break;
                case 7:
                    System.out.println("qual o raio da circunferência?");
                    Scanner rai = new Scanner(System.in);
                    float raioa = rai.nextFloat();
                    System.out.println("a área da circunferência é de :" + raioa * raioa * 3.14159265359);
                    break;
                case 8:
                    System.out.println("qual o coeficiente A da equação?");
                    Scanner a = new Scanner(System.in);
                    float coefa = a.nextFloat();
                    System.out.println("qual o coeficiente B da equação?");
                    Scanner b = new Scanner(System.in);
                    float coefb = b.nextFloat();
                    System.out.println("qual o coeficiente C da equação?");
                    Scanner c = new Scanner(System.in);
                    float coefc = c.nextFloat();
                    System.out.println("o valor do delta da equação é de: " + ((coefb * coefb) - (4 * coefa * coefc)));
                    break;
                case 14:
                    System.out.println("qual a coordenada x do primeiro ponto?");
                    Scanner coordx1 = new Scanner(System.in);
                    float x1 = coordx1.nextFloat();
                    System.out.println("qual a coordenada y do primeiro ponto?");
                    Scanner coordy1 = new Scanner(System.in);
                    float y1 = coordy1.nextFloat();
                    System.out.println("qual a coordenada x do segundo ponto?");
                    Scanner coordx2 = new Scanner(System.in);
                    float x2 = coordx2.nextFloat();
                    System.out.println("qual a coordenada y do segundo ponto?");
                    Scanner coordy2 = new Scanner(System.in);
                    float y2 = coordy2.nextFloat();
                    float xd = x1 - x2;
                    float yd = y1 - y2;
                    System.out.println("a distância entre os 2 pontos é de :" + (Math.sqrt((xd * xd) + (yd * yd))));
                    break;
                case 15:
                    System.out.println("qual o raio da esfera?");
                    Scanner raio = new Scanner(System.in);
                    float raiov = raio.nextFloat();
                    System.out.println("o volume da esfera é de :" + (4 / 3) * (3.14159265359) * (raiov * raiov * raiov));
                    break;
                case 20:
                    System.out.println("qual palavra será analisada?");
                    String palin = sc.nextLine();
                    int qntd = palin.length();
                    int fo = 0;
                    int fu = 1;
                    while (fo < qntd) {
                        if (palin.charAt(fo) == palin.charAt(qntd - fu)) {
                            fo = fo + 1;
                            fu = fu + 1;
                            if (fu == qntd) {
                                System.out.println("palíndromo");
                            }
                        } else {
                            System.out.println("não é palíndromo");
                            fo = qntd + 1;
                        }
                    }
                    break;
                case 22:
                    System.out.println("qual seu nome completo?");
                    String nome = sc.next();
                    System.out.println(nome);
                    break;
                case 27:
                    System.out.println("qual o primeiro número?");
                    Scanner n1 = new Scanner(System.in);
                    float num1 = n1.nextFloat();
                    System.out.println("qual o segundo número?");
                    Scanner n2 = new Scanner(System.in);
                    float num2 = n2.nextFloat();
                    if (num1 > num2) {
                        System.out.println(num1 + " é maior que " + num2);
                    } else if (num2 > num1) {
                        System.out.println(num2 + " é maior que " + num1);
                    } else {
                        System.out.println("os números são iguais");
                    }
                    break;
                case 28:
                    System.out.println("qual o primeiro número?");
                    Scanner nu1 = new Scanner(System.in);
                    float nume1 = nu1.nextFloat();
                    System.out.println("qual o segundo número?");
                    Scanner nu2 = new Scanner(System.in);
                    float nume2 = nu2.nextFloat();
                    System.out.println("qual o terceiro número?");
                    Scanner nu3 = new Scanner(System.in);
                    float nume3 = nu3.nextFloat();
                    if (nume1 > nume2 && nume1 > nume3) {
                        System.out.println(nume1 + " é o maior número");
                    } else if (nume2 > nume1 && nume2 > nume3) {
                        System.out.println(nume2 + " é o maior número");
                    } else if (nume3 > nume1 && nume3 > nume2) {
                        System.out.println(nume3 + " é o maior número");
                    } else if (nume3 == nume1 || nume3 == nume2 || nume1 == nume2) {
                        if (nume1 > nume2 || nume1 > nume3) {
                            System.out.println(nume1 + " é o maior número");
                        } else if (nume2 > nume1 || nume2 > nume3) {
                            System.out.println(nume2 + " é o maior número");
                        } else if (nume3 > nume2 || nume3 > nume1) {
                            System.out.println(nume3 + " é o maior número");
                        } else {
                            System.out.println("os números são iguais");
                        }
                    }
                    break;
                case 29:
                    System.out.println("qual o número?");
                    Scanner poui = new Scanner(System.in);
                    float numb1 = poui.nextFloat();
                    if (numb1 % 2 == 0) {
                        System.out.println("o número é par");
                    } else {
                        System.out.println("o número é ímpar");
                    }
                    break;
                case 30:
                    System.out.println("qual o número?");
                    Scanner negoupo = new Scanner(System.in);
                    float numb = negoupo.nextFloat();
                    if (numb > 0) {
                        System.out.println("o número é positivo");
                    } else if (numb < 0) {
                        System.out.println("o número é negativo");
                    } else {
                        System.out.println("o número é 0");
                    }
                    break;
                case 31:
                    System.out.println("qual a primeira nota do aluno?");
                    Scanner nota1 = new Scanner(System.in);
                    float nt1 = nota1.nextFloat();
                    System.out.println("qual a segunda nota do aluno?");
                    Scanner nota2 = new Scanner(System.in);
                    float nt2 = nota2.nextFloat();
                    if ((nt1 + nt2) / 2 >= 6) {
                        System.out.println("o aluno foi aprovado");
                    } else {
                        System.out.println("o aluno foi reprovado");
                    }
                    break;
                case 52:
                    System.out.println("qual o número desejado?");
                    Scanner soma = new Scanner(System.in);
                    int sm = soma.nextInt();
                    System.out.println("a soma de todos os números de 1 a " + sm + " é: " + (sm + 1) * (sm / 2));
                    break;
                case 53:
                    System.out.println("qual o número que irá sofrer exponenciação?");
                    Scanner base = new Scanner(System.in);
                    double bs = base.nextDouble();
                    System.out.println("qual será o expoente?");
                    Scanner expoente = new Scanner(System.in);
                    double exp = expoente.nextDouble();
                    System.out.println("o resultado é " + Math.pow(bs, exp));
                    break;
                case 54:
                    System.out.println("qual o número natural que será analisado?");
                    Scanner primo = new Scanner(System.in);
                    int pri = primo.nextInt();
                    int k = 2;
                    int j = 2;
                    int m = 0;
                    do {
                        if (pri == 2) {
                            m = 0;
                        } else if (pri % j == 0) {
                            System.out.println("o número é divisível por: " + k);
                            m = 1;
                        }
                        k = k + 1;
                        j = j + 1;
                    }
                    while (k <= pri - 1);
                    if (m == 0) {
                        System.out.println("primo");
                        break;
                    }
            }
        }
    }
}