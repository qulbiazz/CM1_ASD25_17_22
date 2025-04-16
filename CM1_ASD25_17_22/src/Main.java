import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transaksi[] trs = new Transaksi[5];

        ServiceTransaksi service = new ServiceTransaksi(5);

        Bank nasabah1 = new Bank("16030927 3084", "Wallace", "Mei Mei", "082-458-264-3263", "wallace@gmail.com");
        Bank nasabah2 = new Bank("16100617 0573", "Darius", "Susanti", "081-357-843-0547", "darius@gmail.com");
        Bank nasabah3 = new Bank("16240401 2243", "Fuller", "Rosalia", "085-556-712-7062", "fukller@gmail.com");
        Bank nasabah4 = new Bank("16270525 0112", "Maria", "Krabela", "082-267-223-0234", "maria@gmail.com");
        Bank nasabah5 = new Bank("16101617 2416", "Gery", "Fatimah", "083-683-416-8323", "gery@gmail.com");

        service.tambah(new Transaksi("Tr005", nasabah1, 500000, 200000, 700000, "23-04-2024", "Kredit"));
        service.tambah(new Transaksi("Tr004", nasabah2, 500000, 150000, 650000, "23-04-2024", "Kredit"));
        service.tambah(new Transaksi("Tr003", nasabah3, 500000, 300000, 200000, "23-04-2024", "Debit"));
        service.tambah(new Transaksi("Tr002", nasabah4, 500000, 100000, 600000, "23-04-2024", "Kredit"));
        service.tambah(new Transaksi("Tr001", nasabah5, 500000, 100000, 400000, "23-04-2024", "Debit"));

        int pilihan;
        do {
            System.out.println("===========POLINEMA BANK =========");
            System.out.println("1. Data Norek");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Search data");
            System.out.println("4. Display min/max saldo");
            System.out.println("5. sort data");
            System.out.println("6. exit");
            System.out.print("chose menu (1-6) : ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {

                case 1:
                    System.out.printf("%-17s %-10s %-10s %-20s %-20s%n", "No Rekening", "Nama", "Nama Ibu", "Nohp",
                            "Email");
                    service.displayDataNorek();
                    break;
                case 2:
                    System.out.printf("%-17s %-10s %-10s %-20s %-20s%n", "Kode Transaksi", "No Rekening",
                            "Saldo", "In/Out Saldo", "Final Saldo", "Tanggal Transaksi", "Type");

                    service.displayData();
                    break;
                case 3:
                    System.out.println("pencarian Transaksi");
                    System.out.print("Masukkan kode Transaksi: ");
                    String kodeTransaksi = sc.nextLine();
                    service.searching(kodeTransaksi);
                    break;
                case 4:
                    System.out.println("menampilkan Minimal final saldo");
                    service.findMaxInOutSaldo();
                    break;
                case 5:
                    System.out.println("Data diurutkan berdasarkan Debit/Kredit (ASC)");
                    service.Sorting();
                    break;
                case 6:
                    System.out.println("Terima Kasih");
                    return;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (true);

    }
}