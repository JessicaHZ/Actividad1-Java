import java.util.Scanner;

public class actividad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int totalVotos = 0;
        int voto;

        System.out.println("Sistema de Votación");
        System.out.println("Ingrese el número del candidato (1, 2, 3)");
        System.out.println("Ingrese 0 para terminar");

        do {
            System.out.print("Ingrese voto: ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    totalVotos++;
                    break;
                case 2:
                    candidato2++;
                    totalVotos++;
                    break;
                case 3:
                    candidato3++;
                    totalVotos++;
                    break;
                case 0:
                    System.out.println("Fin de votación.");
                    break;
                default:
                    System.out.println("Candidato no válido.");
            }

        } while (voto != 0);

        if (totalVotos > 0) {
            double porcentaje1 = (candidato1 * 100.0) / totalVotos;
            double porcentaje2 = (candidato2 * 100.0) / totalVotos;
            double porcentaje3 = (candidato3 * 100.0) / totalVotos;

            System.out.println("\nResultados:");
            System.out.println("Candidato 1: " + porcentaje1 + "%");
            System.out.println("Candidato 2: " + porcentaje2 + "%");
            System.out.println("Candidato 3: " + porcentaje3 + "%");
        } else {
            System.out.println("No se registraron votos.");
        }

        scanner.close();
    }
}
