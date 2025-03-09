public class Pegawai {
    // Atribut
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double bonus;

    // Default Constructor
    public Pegawai() {
        this.nama = "";
        this.jabatan = "";
        this.gajiPokok = 0.0;
        this.tunjangan = 0.0;
        this.potongan = 0.0;
        this.bonus = 0.0;
    }

    // Overloading Constructor
    public Pegawai(String nama, String jabatan, double gajiPokok, double tunjangan, double potongan, double bonus) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        this.bonus = bonus;
    }

    // Instance Method untuk menghitung total gaji
    public double hitungGajiTotal() {
        return gajiPokok + tunjangan + bonus - potongan;
    }

    // Instance Method untuk menampilkan informasi pegawai dalam format tabel
    public void displayInfo() {
        System.out.println("+--------------------+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");
        System.out.printf("| %-18s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |\n", 
                          "Nama", "Jabatan", "Gaji Pokok", "Tunjangan", "Potongan", "Bonus", "Total Gaji");
        System.out.println("+--------------------+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");
        System.out.printf("| %-18s | %-15s | %-15.2f | %-15.2f | %-15.2f | %-15.2f | %-15.2f |\n", 
                          nama, jabatan, gajiPokok, tunjangan, potongan, bonus, hitungGajiTotal());
        System.out.println("+--------------------+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");
    }

    // Instance Method untuk menambah bonus
    public void tambahBonus(double tambahanBonus) {
        this.bonus += tambahanBonus;
    }

    // Setter untuk mengisi data pegawai
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
