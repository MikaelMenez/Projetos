import java.util.Date;
import java.util.Scanner;
public class pessoa {
     Scanner sc=new Scanner(System.in);
     private double altura;
     private Date dataDeNascimento;
     private String corDosOlhos;
     private double peso;
     private String nome;
     private String nacionalidade;
     private String cidadeNatal;


     public double getAltura() {
          return altura;
     }

     public void setAltura(double altura) {
          this.altura = altura;
     }

     public Date getDataDeNascimento() {
          return dataDeNascimento;
     }

     public void setDataDeNascimento(Date dataDeNascimento) {
          this.dataDeNascimento = dataDeNascimento;
     }

     public String getCorDosOlhos() {
          return corDosOlhos;
     }

     public void setCorDosOlhos(String corDosOlhos) {
          this.corDosOlhos = corDosOlhos;
     }

     public double getPeso() {
          return peso;
     }

     public void setPeso(double peso) {
          this.peso = peso;
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getNacionalidade() {
          return nacionalidade;
     }

     public void setNacionalidade(String nacionalidade) {
          this.nacionalidade = nacionalidade;
     }

     public String getCidadeNatal() {
          return cidadeNatal;
     }

     public void setCidadeNatal(String cidadeNatal) {
          this.cidadeNatal = cidadeNatal;
     }
}