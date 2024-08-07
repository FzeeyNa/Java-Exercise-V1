package blocking1;
public class Bilangan {
    private int[] data;

    public Bilangan(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public double rataRata() {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.length;
    }

    public int nilaiMaksimum() {
        int max = data[0];
        for (int num : data) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int nilaiMinimum() {
        int min = data[0];
        for (int num : data) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public String indexDari(int nilai) {
        StringBuilder indices = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == nilai) {
                if (indices.length() > 0) indices.append(", ");
                indices.append(i);
            }
        }
        return indices.toString();
    }

    public static void main(String[] args) {
        Bilangan bilangan = new Bilangan(new int[]{-5, -3, -6, -3, -4});

        System.out.println("Nilai rata-rata: " + bilangan.rataRata());
        System.out.println("Nilai maksimum: " + bilangan.nilaiMaksimum());
        System.out.println("Nilai minimum: " + bilangan.nilaiMinimum());
        System.out.println("Index dari angka -3: " + bilangan.indexDari(-3));
    }
}