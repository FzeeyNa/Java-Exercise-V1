package blocking1;
public class Array {
    private String[] mhs;
    private int[] deret;
    private int hasilPenjumlahan;

    public void setMhs(String[] mhs) {
        this.mhs = mhs;
    }

    public String[] getMhs() {
        return mhs;
    }

    public void setDeret(int[] deret) {
        this.deret = deret;
    }

    public int[] getDeret() {
        return deret;
    }

    public void setPenjumlahan(int[] deret) {
        hasilPenjumlahan = 0;
        for (int i = 0; i < deret.length; i++) {
            hasilPenjumlahan += deret[i];
        }
    }

    public int getPenjumlahan() {
        return hasilPenjumlahan;
    }

    public void tampil(String a) {
        System.out.println(a);
    }

    public void tampil(String[] a) {
        String data = String.join(", ", a);
        System.out.println(data);
    }

    public void tampil(int a) {
        System.out.println(a);
    }

    public void tampil(int[] a) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
    }

    public void hapus() {
        mhs = null;
        deret = null;
        hasilPenjumlahan = 0;
    }
}