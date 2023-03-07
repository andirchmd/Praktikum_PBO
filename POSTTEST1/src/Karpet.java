public class Karpet {
    private String model;
    private String warna;
    private String ukuran;

    public Karpet(String model, String warna, String ukuran) {
        this.model = model;
        this.warna = warna;
        this.ukuran = ukuran;
    }

    public String getModel() {
        return model;
    }

    public String getWarna() {
        return warna;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public String toString() {
        return "Model  : " + model + "\nWarna  : " + warna + "\nUkuran : " + ukuran;
    }
}