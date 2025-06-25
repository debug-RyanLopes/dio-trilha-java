import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner sc =  new Scanner(System.in);
        sc.useLocale(Locale.US);


        //TODO: Perguntar as informações bancarias do usuário
        System.out.println("Qual o seu nome? ");
        var nome = sc.nextLine(); 

        System.out.println("Qual o numero da sua conta?");
        var numeroConta = sc.nextInt();

        System.out.println("Qual o numero da sua agencia? (somente numeros, sem pontuação)");
        var numeroAgencia = sc.nextInt();

        System.out.println("E qual seria o valor a ser depositado? ");
        var saldo = sc.nextDouble();



        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%s já está disponível para saque", nome, numeroAgencia, numeroConta, saldo );



        sc.close();
    }
}
