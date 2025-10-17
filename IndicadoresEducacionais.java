//importar recurso para entrada de respostas do usuario;
import java.util.Scanner;
public class IndicadoresEducacionais {
    public static void main(String[] args) {
//define a entrada de usuario
    Scanner entrada = new Scanner(System.in);
//aqui o diretor coloca a média das notas dos alunos;
    System.out.println("=== Sistema de Indicadores Educacionais ===");
    System.out.println("Digite a média das notas dos alunos: ");
    double mediaNotas = entrada.nextDouble();
//aqui o diretor coloca a taxa de aprovação que foi obtida;
    System.out.println("Digite a taxa de aprovação (%): ");
    double taxaAprovacao = entrada.nextDouble();
//aqui o diretor estabelece uma meta para o proximo SAEB;
    System.out.println("Digite a meta estabelecida pela escola: ");
    double meta = entrada.nextDouble();
//agora não se escreve nada, o software faz o resto do trabalho;
//aqui se calcula o indice do SAEB conforme os resultados obtidos;
    double indice = (mediaNotas * 0.6) + (taxaAprovacao * 0.3) + (meta * 0.1);
//mostra qual acabou sendo o indice
    System.out.println("\nO índice educacional calculado é: " + indice);
//qualifica como esta a escola em relação à meta
    if (indice >= 90) {
//Ótimo trabalho
        System.out.println("Excelente! A escola está acima da meta!");
    } else if (indice >= 70) {
//Neutral
        System.out.println("Bom desempenho! Mas ainda há espaço para melhorias.");
    } else {
//Horrivel
        System.out.println("Atenção: é preciso melhorar o desempenho coletivo.");
    }
//desliga a entrada de respostas do usuario;
    entrada.close();
} }