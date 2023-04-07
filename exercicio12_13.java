import java.util.Scanner;

public class exercicio12_13 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String sexo;
    double altura;
    double pesoIdeal;

    System.out.println("Qual o seu sexo? Digite: \n '1' = Homem \n '2' = Mulher");
    sexo = input.next();

    System.out.println("Informe a sua altura: ");
    altura = input.nextDouble();

    input.close();

    double pesoIdealMulher = (62.1 * altura) - 44.7;
    double pesoIdealHomem = (72.7 * altura) - 58;

    if (sexo.equals("1")) {
      pesoIdeal = pesoIdealHomem;
      System.out.println("Seu peso ideal é " + pesoIdeal + "kg.");
    } else if (sexo.equals("2")) {
      pesoIdeal = pesoIdealMulher;
      System.out.println("Seu peso ideal é " + pesoIdeal + "kg.");
    } else {
      System.out.println("Por favor, informe o sexo corretamente.");
    }

  }
}