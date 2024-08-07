package blocking1;
public class Lat2array {
    private double[] data;

    public Lat2array(int[] dataInt) {
        data = new double[dataInt.length];
        for (int i = 0; i < dataInt.length; i++) {
            this.data[i] = dataInt[i];
        }
    }

    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }

    public void kalikanDenganSetengah() {
        for (int i = 0; i < data.length; i++) {
            data[i] *= 0.5;
        }
    }
}