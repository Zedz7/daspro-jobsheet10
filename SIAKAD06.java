import java.util.Scanner;

public class SIAKAD06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        System.out.print("Masukkan jumlah Mata kuliah: ");
        int jmlMatkul = sc.nextInt();

        int [][] nilai = new int [jmlMhs][jmlMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPersiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPersiswa / jmlMatkul);
        }   

        System.out.println("\n=====================================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");
        for (int j = 0; j < jmlMatkul; j++) {
            double totalPermatkul = 0;

            for (int i = 0; i < jmlMhs; i++) {
                totalPermatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + totalPermatkul / jmlMhs);
        }
    }
}