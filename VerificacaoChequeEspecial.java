
import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        // Verifica se o saque não ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else {
            // Verifica se o saque ultrapassa o limite do cheque especial
            if (saque - saldo <= limiteChequeEspecial) {
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transacao não realizada. Limite do cheque especial excedido.");
            }
        }

        scanner.close();
    }
}