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
        System.out.printf("%s\t%s\t%.1f\t\t%.1f\t\t%.1f", noRekening, nama, namaibu, noHp, email);
    }

}

