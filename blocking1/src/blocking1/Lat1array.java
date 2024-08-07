package blocking1;
public class Lat1array {
    private int[] data;

    public Lat1array(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public void ubahLimaMenjadiSatu() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 5) {
                data[i] = 1;
            }
        }
    }
}