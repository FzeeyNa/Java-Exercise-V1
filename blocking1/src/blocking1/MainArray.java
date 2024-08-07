package blocking1;
public class MainArray {
    public static void main(String[] args) {
        // Langkah 1: Ubah 5 menjadi 1
        int[] bilanganAwal = {2, 5, 3, 5, 9, 5};
        Lat1array bilangan = new Lat1array(bilanganAwal);
        bilangan.ubahLimaMenjadiSatu();
        System.out.println("Hasil setelah mengubah 5 menjadi 1:");
        for (int num : bilangan.getData()) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Langkah 2: Kalikan dengan 0.5
       Lat2array operasi = new Lat2array(bilangan.getData());
        operasi.kalikanDenganSetengah();
        System.out.println("Hasil setelah dikalikan dengan 0.5:");
        for (double num : operasi.getData()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
