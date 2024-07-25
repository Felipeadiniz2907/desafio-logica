import java.util.Scanner;

public class calc_ranking {
    public static void main(String[] args) {
        
        int vitorias = 0;
        int derrotas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de vitórias:");
        vitorias = scanner.nextInt();
        System.out.println("Digite a quantidade de derrotas:");
        derrotas = scanner.nextInt();

        ranking (vitorias, derrotas);
        scanner.close();

    }


public static void ranking(int vitorias , int derrotas){
   

    String nivel = "Sem Ranking";

    vitorias = vitorias - derrotas;

    if (vitorias <= 10) {
        nivel = "Ferro";
    } else if (vitorias >= 11 && vitorias <= 20) {
        nivel = "Bronze";
    } else if (vitorias >= 21 && vitorias <= 50) {
        nivel = "Prata";
    } else if (vitorias >= 51 && vitorias <= 70) {
        nivel = "Ouro";
    } else if (vitorias >= 71 && vitorias <= 80) {
        nivel = "Platina";
    } else if (vitorias >= 81 && vitorias <= 90) {
        nivel = "Diamante";
    } else if (vitorias >= 91 && vitorias <= 100) {
        nivel = "Lendário";
    } else if (vitorias >= 101) {
        nivel = "Imortal";
    }

    System.out.println("O Herói tem saldo de " + vitorias + " está no nível de " + nivel + "");
}
}
