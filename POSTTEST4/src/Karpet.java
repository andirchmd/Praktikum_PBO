public class Karpet {
    private String merk;
    private String warna;
    private String ukuran;

    public Karpet(String merk, String warna, String ukuran) {
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    
    @Override
    public String toString() {
        return "Merk  : " + merk + "\nWarna  : " + warna + "\nUkuran : " + ukuran;
    }

}