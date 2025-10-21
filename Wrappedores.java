public class Wrappedores {
    //função de inicio
    public static void main(String[] args) {

        //Exercicio 1
        System.out.println("Exercicio 1");
        //r
        String value1 = "50";
        int value1_b = Integer.parseInt(value1);
        System.out.println(value1_b);
        
        //Exercicio 2
        System.out.println("\nExercicio 2");
        //r
        String value2 = "7.5";
        double value2b = Double.parseDouble(value2);
        System.out.println(value2b);

        //Exercicio 3
        System.out.println("\nExercicio 3");
        //r
        String value3 = "true";
        boolean value3_b = Boolean.parseBoolean(value3);
        System.out.println(value3_b);

        //Exercicio 4
        System.out.println("\nExercicio 4");
        //r
        String value4_a_1 = "10";
        String value4_a_2 = "20";
        int value4_b_1 = Integer.parseInt(value4_a_1);
        int value4_b_2 = Integer.parseInt(value4_a_2);
        int soma1 = (value4_b_1 + value4_b_2);
        System.out.println(soma1);

        //Exercicio 5
        System.out.println("\nExercicio 5");
        //r
        String value5 = "30";
        int value5_b = Integer.parseInt(value5);
        value5_b = value5_b += 5;
        System.out.println("O novo valor é:"+value5_b);

        //Exercicio 6
        System.out.println("\nExercicio 6");
        //r
        String value6 = "9.99";
        double value6_b = Double.parseDouble(value6);
        value6_b = value6_b * 3;
        System.out.println("O resultado é: "+value6_b);

        //Exercicio 7
        System.out.println("\nExercicio 7");
        //r
        int value7 = 45;
        String value7_b = String.valueOf(value7);
        System.out.println("Agora o numero "+value7_b+" virou texto");

        //Exercicio 8
        System.out.println("\nExercicio 8");
        //r
        String value8_a_1 = "25";
        String value8_a_2 = "1.70";
        String value8_a_3 = "true";
        int value8_b_1 = Integer.parseInt(value8_a_1);
        double value8_b_2 = Double.parseDouble(value8_a_2);
        boolean value8_b_3 = Boolean.parseBoolean(value8_a_3);
        System.out.println("Idade: "+value8_b_1);
        System.out.println("Altura: "+value8_b_2);
        System.out.println("Ativo: "+value8_b_3);

        //fim
        System.out.println("\nPrograma Finalizado");
    }
}
