import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [][] penonton = new String [4][2];
        String nama, next;
        int baris, kolom, menu;

        while (true){
            System.out.println("--- Menu Bioskop ---");
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1: 
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
    
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris atau kolom yang anda masukkan tidak tersedia, coba lagi");
                        } else if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Kursi tersebut sudah terisi oleh " + penonton[baris-1][kolom-1] + ". silahkan pilih kursi lain");
                        } else {
                            penonton[baris -1][kolom -1] = nama;
                            System.out.println("Data penonton berhasil ditambahkan");
                            break;
                        }
                    }
                    break;
                
                case 2:
                    System.out.println("Daftar penonton");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris ke-" + (i+1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print((penonton[i][j] != null ? penonton[i][j] : "***") + "\t");
                        }
                        System.out.println();
                    }
                    break;
                
                case 3: 
                    System.out.println("Terima kasih ");
                    System.exit(0);
                
                default: 
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }

}