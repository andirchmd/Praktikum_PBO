// Kulit hewan apa
// Jenis kulit (imitasi atau asli)

public class Kulit extends Karpet{
    private String hewan;
    private String jenis;

    public Kulit(String merk, String warna, String ukuran, String hewan, String jenis) {
        super(merk, warna, ukuran);
        this.hewan = hewan;
        this.jenis = jenis;
    }

    public String getHewan() {
        return hewan;
    }

    public void setHewan(String hewan) {
        this.hewan = hewan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

}

