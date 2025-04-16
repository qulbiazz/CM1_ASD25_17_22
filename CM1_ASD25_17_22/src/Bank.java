public class Bank {
    String noRekening;
    String nama;
    String namaibu;
    String noHp;
    String email;

    public Bank(String noRekening, String nama, String namaibu, String noHp, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaibu = namaibu;
        this.noHp = noHp;
        this.email = email;
    }

    void tampilDataNorek() {
        System.out.printf("%-17s %-10s %-10s %-20s %-20s%n", noRekening, nama, namaibu, noHp, email);
    }

}
