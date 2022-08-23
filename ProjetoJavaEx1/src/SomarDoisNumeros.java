import java.util.*;
class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String arg[]) {
		int soma, num1, num2;
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = sc.nextInt();
		soma = num1 + num2;
		System.out.println("Soma: " + soma);
	}
}
