import java.util.Scanner;

public class Tugas_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        System.out.println("Pilih Operator:");
        System.out.println("1.(+)");
        System.out.println("2.(-)");
        System.out.println("3.(*)");
        System.out.println("4.(/)");

        System.out.print("Pilih nomor operator: ");
        int pilihan = scanner.nextInt();

        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Tidak ada pembagian nol");
                    return;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}