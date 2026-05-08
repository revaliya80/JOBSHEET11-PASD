import java.util.Scanner;

public class SLLMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList24 sll = new SingleLinkedList24();

        for (int i = 1; i <= 4; i++) {
            System.out.println("Data Mahasiswa ke-" + i);

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa24 mhs = new Mahasiswa24(nim, nama, kelas, ipk);

            sll.addLast(mhs);
            sll.print();
        }

        sc.close();
    }
}