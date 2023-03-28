public class Vinyl extends Karpet {
    private String motif;
    private float tebal;

    public Vinyl(String merk, String warna, String ukuran, String motif, float tebal) {
        super(merk, warna, ukuran);
        this.motif = motif;
        this.tebal = tebal;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public float getTebal() {
        return tebal;
    }

    public void setTebal(float tebal) {
        this.tebal = tebal;
    }

    @Override
    public String toString() {
        return "Motif : " + motif + "\nTebal : " + tebal;
    }
    
}