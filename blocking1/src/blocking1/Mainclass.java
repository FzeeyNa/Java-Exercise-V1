package blocking1;

public class Mainclass {
    public static void main(String[] args) {
        AlatTulis bolpoint = new AlatTulis();
        AlatTulis pensil = new AlatTulis();
        AlatTulis penghapus = new AlatTulis();

        bolpoint.setNama("Bolpoint");
        bolpoint.setStok(10);
        bolpoint.setHargaSatuan(2000);

        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);

        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);

        System.out.println("Nama Alat Tulis: " + bolpoint.getNama());
        System.out.println("Stok: " + bolpoint.getStok());
        System.out.println("Harga Satuan: " + bolpoint.getHargaSatuan());
        System.out.println("Harga Bolpoint: " + bolpoint.getHargaTotal());
        System.out.println();
        
        System.out.println("Nama Alat Tulis: " + pensil.getNama());
        System.out.println("Stok: " + pensil.getStok());
        System.out.println("Harga Satuan: " + pensil.getHargaSatuan());
        System.out.println("Harga Pensil: " + pensil.getHargaTotal());
        System.out.println();

        System.out.println("Nama Alat Tulis: " + penghapus.getNama());
        System.out.println("Stok: " + penghapus.getStok());
        System.out.println("Harga Satuan: " + penghapus.getHargaSatuan());
        System.out.println("Harga Penghapus: " + penghapus.getHargaTotal());
        System.out.println();

        int totalHarga = bolpoint.getHargaTotal() + pensil.getHargaTotal() + penghapus.getHargaTotal();
        System.out.println("Total Harga: " + totalHarga);
    }
}
