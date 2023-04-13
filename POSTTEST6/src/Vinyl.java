final public class Vinyl extends Karpet {
    protected String motif;
    protected float tebal;

    protected Vinyl(String merk, String warna, String ukuran, String motif, float tebal) {
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
        this.motif = motif;
        this.tebal = tebal;
    }

    final protected String getMotif() {
        return motif;
    }

    final protected void setMotif(String motif) {
        this.motif = motif;
    }

    final protected float getTebal() {
        return tebal;
    }

    final protected void setTebal(float tebal) {
        this.tebal = tebal;
    }

    final protected String getMerk(){
        return merk;
    }
    
    final protected String getWarna(){
        return warna;
    }

    final protected String getUkuran(){
        return ukuran;
    }

    final protected void setMerk(String merk){
        this.merk = merk;
    }
    
    final protected void setWarna(String warna){
        this.warna = warna;
    }

    final protected void setUkuran(String ukuran){
        this.ukuran = ukuran;
    }

    @Override
    final public String toString() {
        return "Merk   : " + merk + "\nWarna  : " + warna + "\nUkuran : " + ukuran + " cm" +"\nMotif  : " + motif + "\nTebal  : " + tebal + " mm";
    }
    
}