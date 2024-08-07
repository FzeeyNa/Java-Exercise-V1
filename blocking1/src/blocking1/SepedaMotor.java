package blocking1;

public class SepedaMotor {
    private String merk;
    private long harga;
    
public void setMerk(String merkMotor) {
    merk = merkMotor;
}

public String getMerk(){
    return merk;
}

public long Harga(long hargaMotor) {
    return setHarga(hargaMotor);
}

public long getHarga() {
	return harga;
}

public long setHarga(long harga) {
	this.harga = harga;
	return harga;
}
}