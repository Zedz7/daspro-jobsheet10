import java.util.Scanner;

public class flow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] data = new int[10][6]; 

        System.out.println("Masukkan hasil survei (nilai 1-5):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + ": ");
                data[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n========================================");
        System.out.println("Rata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            double rataRes = 0;
            for (int j = 0; j < 6; j++) {
                rataRes += data[i][j];
            }
            rataRes /= 6;
            System.out.println("Responden " + (i + 1) + ": " + rataRes);
        }

        System.out.println("\n========================================");
        System.out.println("Rata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double rataPer = 0;
            for (int i = 0; i < 10; i++) {
                rataPer += data[i][j];
            }
            rataPer /= 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataPer);
        }

        System.out.println("\n-----------------------------------------");
        System.out.println("Rata-rata keseluruhan:");
        double totalRata = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalRata += data[i][j];
            }
        }
        totalRata /= (10 * 6);
        System.out.println("Rata-rata keseluruhan: " + totalRata);

        scanner.close();
    }
}