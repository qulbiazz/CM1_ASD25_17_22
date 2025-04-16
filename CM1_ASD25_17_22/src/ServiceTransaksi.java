public class ServiceTransaksi {
    Transaksi[] trs;
    int idx;


    void ServiceTransaksi(int kapasitas) {
        trs = new Transaksi[kapasitas];
        idx = 0;
    }

    public void tambah(Transaksi t) {
        if (idx < trs.length) {
            trs[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void displayData() {
        for (int i = 0; i < idx; i++) {
            trs[i].tampilDataTransaksi();
            System.out.println("====================================");
        }
    }

    void searchingByEmail(String email) {
        boolean found = false;
        for (int i = 0; i < idx; i++) {
            if (trs[i].bankAcc.email.equalsIgnoreCase(email)) {
                System.out.println("Data ditemukan:");
                trs[i].tampilDataTransaksi();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan untuk email: " + email);
        }
    }

    void findMaxInOutSaldo() {
        if (idx == 0) {
            System.out.println("Data masih kosong.");
            return;
        }
        Transaksi max = trs[0];
        for (int i = 1; i < idx; i++) {
            if (trs[i].inOutSaldo > max.inOutSaldo) {
                max = trs[i];
            }
        }
        System.out.println("Transaksi dengan debit/kredit tertinggi:");
        max.tampilDataTransaksi();
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (trs[j].inOutSaldo > trs[j + 1].inOutSaldo) {
                    Transaksi temp = trs[j];
                    trs[j] = trs[j + 1];
                    trs[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan berdasarkan Debit/Kredit (ASC):");
        displayData();
    }

}
