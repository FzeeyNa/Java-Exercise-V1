package blocking1;

public class AlatTulis {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int hargaTotal;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
        setHargaTotal();
    }
    
    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
        setHargaTotal();
    }

    private void setHargaTotal() {
        this.hargaTotal = this.stok * this.hargaSatuan;
    }

    public String getNama() {
        return this.nama;
    }

    public int getStok() {
        return this.stok;
    }

    public int getHargaSatuan() {
        return this.hargaSatuan;
    }

    public int getHargaTotal() {
        return this.hargaTotal;
    }
}
