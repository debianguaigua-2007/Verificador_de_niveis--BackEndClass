import java.util.Scanner;

public class Escaneio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Exercicio 1
        System.out.println("Exercicio 1");
        //r
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Olá "+nome+", Seja bem-vindo ao laboratorio de programação");

        //Exercicio 2
        System.out.println("\nExercicio 2");
        //r
        System.out.println("Digite o primeiro digito: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo digito: ");
        int num2 = entrada.nextInt();
        int resultado1 = num1+num2;
        System.out.println("O resultado é "+resultado1);

        //Exercicio 3
        System.out.println("\nExercicio 3");
        //r
        System.out.println("Qual é a sua massa corporal?(Em kilogramas)");
        double peso = entrada.nextDouble();
        System.out.println("Qual é a sua altura?(Em metros)");
        double altura = entrada.nextDouble();
        double imc = peso/(altura*altura);
        System.out.println("O seu indice de IMC é: "+imc);

        //Exercicio 4
        System.out.println("\nExercicio 4");
        //r
        System.out.println("Digite o preço do desconto: ");
        double preco = entrada.nextDouble();
        System.out.println("Digite o desconto(%)");
        int desconto = entrada.nextInt();
        double resultado2 = preco - (preco*desconto/100);
        System.out.println("O preço final será: "+resultado2);

        //Exercicio 5
        System.out.println("\nExercicio 5");
        //r
        System.out.println("Digite sua nota do primeiro trimestre: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite sua nota do segundo trimestre: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite sua nota do terceiro trimestre: ");
        double nota3 = entrada.nextDouble();
        double resultado3 = (nota1+nota2+nota3)/3;
        if(resultado3 >= 7){
            System.out.println("Você foi aprovado, sua média anual foi: "+resultado3);
        } else if(resultado3 < 7){
            System.out.println("Você foi reprovado, sua média anual foi: "+resultado3);
        }

        //Finalizando o Programa
        entrada.close();
        System.out.println("\nPrograma finalizado");
        //fim
    }
}