import java.util.Scanner;

public class Modifikasi1ArrayNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+": ");
            nilaiAkhir[i] = sc.nextInt();
        } 

        System.out.println("Hasil kelulusan:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Mahasiswa ke-" + i + " ");
            if (nilaiAkhir[i] > 70) {
                System.out.println("lulus!");
            } else {
                System.out.println("tidak lulus!");
            }
        }
    }
}
