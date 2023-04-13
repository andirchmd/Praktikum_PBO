final public class Kulit extends Karpet{
    protected String hewan;
    protected String jenis;

    protected Kulit(String merk, String warna, String ukuran, String hewan, String jenis) {
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
        this.hewan = hewan;
        this.jenis = jenis;
    }

    final protected String getHewan() {
        return hewan;
    }

    final protected void setHewan(String hewan) {
        this.hewan = hewan;
    }

    final protected String getJenis() {
        return jenis;
    }

    final protected void setJenis(String jenis) {
        this.jenis = jenis;
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
        return "Merk         : " + merk + "\nWarna        : " + warna + "\nUkuran       : " + ukuran + " cm" +"\nKulit Hewan  : " + hewan +"\nJenis Kulit  : " + jenis;
    }
    

}