public class Transaksi {
    String kodeTransaksi;
    double saldo;
    double inOutSaldo;
    double finalSaldo;
    String tanggalTransaksi;
    String type;
    Bank bankAcc;

    Transaksi(String kodeTransaksi, Bank bankAcc, double saldo, double inOutSaldo, double finalSaldo,
            String tanggalTransaksi, String type) {
        this.kodeTransaksi = kodeTransaksi;
        this.saldo = saldo;
        this.inOutSaldo = inOutSaldo;
        this.finalSaldo = finalSaldo;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
        this.bankAcc = bankAcc;
    }

    void tampilDataTransaksi() {
        System.out.printf("%s\t%s\t%.1f\t\t%.1f\t\t%.1f\t\t%s\t%s%n", kodeTransaksi, bankAcc.noRekening, saldo,inOutSaldo, finalSaldo, tanggalTransaksi, type);
    }

    void tampil(){
        System.out.println("Kode transaksi      : " +kodeTransaksi);
        System.out.println("Nama                : " +bankAcc.nama);
        System.out.println("No transaksi        : " +bankAcc.noRekening);
        System.out.println("Saldo               : " +saldo);
        System.out.println("InOutSaldo          : " +inOutSaldo);
        System.out.println("Final Saldo         : " +finalSaldo);
        System.out.println("Tanggal transaksi   : " +tanggalTransaksi);
        System.out.println("Type                   : " +type);
    }
}
