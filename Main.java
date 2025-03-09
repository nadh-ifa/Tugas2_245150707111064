public class Main {
    public static void main(String[] args) {
        // Menggunakan Default Constructor
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setNama("Budi Siregar");
        pegawai1.setJabatan("Kapal Lawd");
        pegawai1.setGajiPokok(5000000);
        pegawai1.setTunjangan(2000000);
        pegawai1.setPotongan(50000);

        // Menampilkan informasi pegawai1
        System.out.println("Informasi Pegawai 1:");
        pegawai1.displayInfo();

        // Menambahkan bonus
        pegawai1.tambahBonus(100000);
        System.out.println("\nSetelah menambah bonus:");
        pegawai1.displayInfo();

        // Menggunakan Overloading Constructor
        Pegawai pegawai2 = new Pegawai("Popo Siroyo", "Staff" , 6000000, 3000000, 100000, 0);
        // Menampilkan informasi pegawai2
        System.out.println("\nInformasi Pegawai 2:");
        pegawai2.displayInfo();

        // Menambahkan bonus untuk pegawai 2
        pegawai2.tambahBonus(80000);
        System.out.println("\nSetelah menambah bonus:");
        pegawai2.displayInfo();
    }
}
