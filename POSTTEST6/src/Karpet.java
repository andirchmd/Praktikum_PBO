public abstract class Karpet {
    protected String merk;
    protected String warna;
    protected String ukuran;

    protected abstract String getMerk();
    protected abstract String getWarna();
    protected abstract String getUkuran();
    protected abstract void setMerk(String merk);
    protected abstract void setWarna(String warna);
    protected abstract void setUkuran(String ukuran);

    
    @Override
    public abstract String toString();

}