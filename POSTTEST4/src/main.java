import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
    static ArrayList<Kulit> kptKulit = new ArrayList<>();
    static ArrayList<Vinyl> kptVinyl = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        br.readLine();
    }
    
//    overload
    public static int search(int indeks, int pil) {
        if(pil == 1){
            for(int i = 0; i < kptKulit.size(); i++) {
                if(i == indeks) {
                    return i;
                }
            }
        }else if(pil == 2){
            for(int i = 0; i < kptVinyl.size(); i++) {
                if(i == indeks) {
                    return i;
                }
            }
        }
        return -1;
    } 
    
//    overload
    public static int search(String merk, int pil) {
        if(pil == 1){
            for (int i = 0; i < kptKulit.size(); i++) {
               if (kptKulit.get(i).getMerk().equals(merk)) {
                  return i;
               }
            }
        }else if(pil == 2){
            for (int i = 0; i < kptVinyl.size(); i++) {
               if (kptVinyl.get(i).getMerk().equals(merk)) {
                  return i;
               }
            }
        }
        return -1;
     }
    
    public static void tambahDataKarpet() throws IOException {
        //clear();

        System.out.println("===== Model Karpet =====");
        System.out.println("1. Kulit Hewan");
        System.out.println("2. Vinyl");
        System.out.println("========================");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(br.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Karpet Kulit ==========");
            System.out.print("Masukkan Merk        : ");
            String merk = br.readLine();
            System.out.print("Masukkan Warna       : ");
            String warna = br.readLine();
            System.out.print("Masukkan Ukuran      : ");
            String ukuran = br.readLine();
            System.out.print("Masukkan Kulit Hewan : ");
            String hewan = br.readLine();
            System.out.print("Masukkan Jenis Kulit : ");
            String jenis = br.readLine();
            System.out.println("================================================");
            kptKulit.add(new Kulit(merk, warna, ukuran, hewan, jenis));
            System.out.println("Data karpet kulit berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Karpet Vinyl ==========");
            System.out.print("Masukkan Merk   : ");
            String merk = br.readLine();
            System.out.print("Masukkan Warna  : ");
            String warna = br.readLine();
            System.out.print("Masukkan Ukuran : ");
            String ukuran = br.readLine();
            System.out.print("Masukkan Motif  : ");
            String motif = br.readLine();
            System.out.print("Masukkan Tebal  : ");
            float tebal = Float.parseFloat(br.readLine());
            System.out.println("================================================");
            kptVinyl.add(new Vinyl(merk, warna, ukuran, motif, tebal));
            System.out.println("Data karpet vinyl berhasil ditambahkan!");

        }else{
            System.out.println("Pilihan Salah");

        }
        froze();
    }

    public static void lihatDataKarpet() throws IOException {
        //clear();

        System.out.println("===== Model Karpet =====");
        System.out.println("1. Kulit Hewan");
        System.out.println("2. Vinyl");
        System.out.println("========================");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(br.readLine());
        if(pil == 1){
            if(kptKulit.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                System.out.println("=========== List Data Karpet Kulit ===========");
                    for(int i = 0; i < kptKulit.size();i++){
                        System.out.println("Data Index ke-" + (i+1));
                        System.out.println("Merk        : " + kptKulit.get(i).getMerk());
                        System.out.println("Warna       : " + kptKulit.get(i).getWarna());
                        System.out.println("Ukuran      : " + kptKulit.get(i).getUkuran() + " cm");
                        System.out.println("Kulit Hewan : " + kptKulit.get(i).getHewan());
                        System.out.println("Jenis Kulit : " + kptKulit.get(i).getJenis());
                        if(i != kptKulit.size()-1){
                            System.out.println("");
                        }
                    }
                System.out.println("==============================================");
            }
        }else if(pil == 2){
            if(kptVinyl.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                System.out.println("=========== List Data Karpet Vinyl ===========");
                    for(int i = 0; i < kptVinyl.size();i++){
                        System.out.println("Data Index ke-" + (i+1));
                        System.out.println("Merk      : " + kptVinyl.get(i).getMerk());
                        System.out.println("Warna     : " + kptVinyl.get(i).getWarna());
                        System.out.println("Ukuran    : " + kptVinyl.get(i).getUkuran() + " cm");
                        System.out.println("Motif     : " + kptVinyl.get(i).getMotif());
                        System.out.println("Ketebalan : " + kptVinyl.get(i).getTebal() + " mm");
                        if(i != kptVinyl.size()-1){
                            System.out.println("");
                        }
                    }
                System.out.println("==============================================");
            }
        }else{
            System.out.println("Pilihan salah");
        }
        froze();
    }

    public static void ubahDataKarpet() throws IOException {
        //clear();
        int index, cari;
        String carimerk;
        
        System.out.println("===== Model Karpet =====");
        System.out.println("1. Kulit Hewan");
        System.out.println("2. Vinyl");
        System.out.println("========================");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(br.readLine());
        if(pil == 1){
            if(kptKulit.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                System.out.println("===== Ubah Berdasarkan =====");
                System.out.println("1. Indeks");
                System.out.println("2. Merk");
                System.out.println("============================");
                System.out.print("Pilih menu: ");
                int menu = Integer.parseInt(br.readLine());
                if(menu == 1){
                    System.out.print("Masukkan indeks data karpet yang ingin diubah: ");
                    cari = Integer.parseInt(br.readLine());
                    index = search(cari,pil);
                    if (index == -1) {
                        System.out.println("Indeks tidak ditemukan!");
                    } else {
                        Kulit karpet = kptKulit.get(index);
                        System.out.println("Data karpet dengan indeks " + index);
                        System.out.println(karpet);
                        System.out.println("======= Masukkan data karpet yang baru =======");
                        System.out.print("Masukkan Merk        : ");
                        String merk = br.readLine();
                        System.out.print("Masukkan Warna       : ");
                        String warna = br.readLine();
                        System.out.print("Masukkan Ukuran      : ");
                        String ukuran = br.readLine();
                        System.out.print("Masukkan Kulit Hewan : ");
                        String hewan = br.readLine();
                        System.out.print("Masukkan Jenis Kulit : ");
                        String jenis = br.readLine();
                        System.out.println("==============================================");
                        karpet.setMerk(merk);
                        karpet.setWarna(warna);
                        karpet.setUkuran(ukuran);
                        karpet.setHewan(hewan);
                        karpet.setJenis(jenis);
                        System.out.println("Data karpet berhasil diubah!");
                    }
                }else if(menu == 2){
                    System.out.print("Masukkan merk karpet yang ingin diubah: ");
                    carimerk = br.readLine();
                    index = search(carimerk,pil);
                    if (index == -1) {
                        System.out.println("Indeks tidak ditemukan!");
                    } else {
                        Kulit karpet = kptKulit.get(index);
                        System.out.println("Data karpet dengan indeks " + index);
                        System.out.println(karpet);
                        System.out.println("======= Masukkan data karpet yang baru =======");
                        System.out.print("Masukkan Merk        : ");
                        String merk = br.readLine();
                        System.out.print("Masukkan Warna       : ");
                        String warna = br.readLine();
                        System.out.print("Masukkan Ukuran      : ");
                        String ukuran = br.readLine();
                        System.out.print("Masukkan Kulit Hewan : ");
                        String hewan = br.readLine();
                        System.out.print("Masukkan Jenis Kulit : ");
                        String jenis = br.readLine();
                        System.out.println("==============================================");
                        karpet.setMerk(merk);
                        karpet.setWarna(warna);
                        karpet.setUkuran(ukuran);
                        karpet.setHewan(hewan);
                        karpet.setJenis(jenis);
                        System.out.println("Data karpet berhasil diubah!");
                    }
                }else{
                    System.out.println("Pilihan Menu tidak ada!");
                }
            }
        }else if(pil == 2){
            if(kptVinyl.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                System.out.println("===== Ubah Berdasarkan =====");
                System.out.println("1. Indeks");
                System.out.println("2. Merk");
                System.out.println("============================");
                System.out.print("Pilih menu: ");
                int menu = Integer.parseInt(br.readLine());
                if(menu == 1){
                    System.out.print("Masukkan indeks data karpet yang ingin diubah: ");
                    cari = Integer.parseInt(br.readLine());
                    index = search(cari,pil);
                    if (index == -1) {
                        System.out.println("Indeks tidak ditemukan!");
                    } else {
                        Vinyl karpet = kptVinyl.get(index);
                        System.out.println("Data karpet dengan indeks " + index);
                        System.out.println(karpet);
                        System.out.println("======= Masukkan data karpet yang baru =======");
                        System.out.print("Masukkan Merk   : ");
                        String merk = br.readLine();
                        System.out.print("Masukkan Warna  : ");
                        String warna = br.readLine();
                        System.out.print("Masukkan Ukuran : ");
                        String ukuran = br.readLine();
                        System.out.print("Masukkan Motif  : ");
                        String motif = br.readLine();
                        System.out.print("Masukkan Tebal  : ");
                        float tebal = Float.parseFloat(br.readLine());
                        System.out.println("==============================================");
                        karpet.setMerk(merk);
                        karpet.setWarna(warna);
                        karpet.setUkuran(ukuran);
                        karpet.setMotif(motif);
                        karpet.setTebal(tebal);
                        System.out.println("Data karpet berhasil diubah!");
                    }
                }else if(menu == 2){
                    System.out.print("Masukkan merk karpet yang ingin diubah: ");
                    carimerk = br.readLine();
                    index = search(carimerk,pil);
                    if (index == -1) {
                        System.out.println("Indeks tidak ditemukan!");
                    } else {
                        Vinyl karpet = kptVinyl.get(index);
                        System.out.println("Data karpet dengan indeks " + index);
                        System.out.println(karpet);
                        System.out.println("======= Masukkan data karpet yang baru =======");
                        System.out.print("Masukkan Merk   : ");
                        String merk = br.readLine();
                        System.out.print("Masukkan Warna  : ");
                        String warna = br.readLine();
                        System.out.print("Masukkan Ukuran : ");
                        String ukuran = br.readLine();
                        System.out.print("Masukkan Motif  : ");
                        String motif = br.readLine();
                        System.out.print("Masukkan Tebal  : ");
                        float tebal = Float.parseFloat(br.readLine());
                        System.out.println("==============================================");
                        karpet.setMerk(merk);
                        karpet.setWarna(warna);
                        karpet.setUkuran(ukuran);
                        karpet.setMotif(motif);
                        karpet.setTebal(tebal);
                        System.out.println("Data karpet berhasil diubah!");
                    }
                }else{
                    System.out.println("Pilihan Menu tidak ada!");
                }
            }
        }else{
            System.out.println("Pilihan salah");
        }
        froze();
        }
        
    

    public static void hapusDataKarpet() throws IOException {
        //clear();
        int cari,index, menu;
        String carimerk;
        System.out.println("===== Model Karpet =====");
        System.out.println("1. Kulit Hewan");
        System.out.println("2. Vinyl");
        System.out.println("========================");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(br.readLine());
        if(pil == 1){
            if (kptKulit.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.println("===== Ubah Berdasarkan =====");
                System.out.println("1. Indeks");
                System.out.println("2. Merk");
                System.out.println("============================");
                System.out.print("Pilih menu: ");
                menu = Integer.parseInt(br.readLine());
                if(menu == 1){
                    System.out.print("Masukkan indeks data karpet yang ingin dihapus: ");
                    cari = Integer.parseInt(br.readLine());
                    index = search(cari,pil);
                    if (index == -1) {
                        System.out.println("Indeks tidak ditemukan!");
                    } else {
                        Kulit karpet = kptKulit.get(index);
                        kptKulit.remove(index);
                        System.out.println("Data karpet dengan indeks " + index + " berhasil dihapus:");
                        System.out.println(karpet);
                    }
                }else if(menu == 2){
                    System.out.print("Masukkan merk karpet yang ingin dihapus: ");
                    carimerk = br.readLine();
                    index = search(carimerk,pil);
                    if (index == -1) {
                        System.out.println("Indeks tidak ditemukan!");
                    } else {
                        Kulit karpet = kptKulit.get(index);
                        kptKulit.remove(index);
                        System.out.println("Data karpet dengan indeks " + index + " berhasil dihapus:");
                        System.out.println(karpet);
                    }
                }else{
                    System.out.println("Pilihan menu tidak ada!");
                }
            }
        }else if(pil == 2){
            if (kptVinyl.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.println("===== Ubah Berdasarkan =====");
                System.out.println("1. Indeks");
                System.out.println("2. Merk");
                System.out.println("============================");
                System.out.print("Pilih menu: ");
                menu = Integer.parseInt(br.readLine());
                if(menu == 1){
                    System.out.print("Masukkan indeks data karpet yang ingin dihapus: ");
                    cari = Integer.parseInt(br.readLine());
                    index = search(cari,pil);
                    if (index == -1) {
                        System.out.println("Indeks tidak ditemukan!");
                    } else {
                        Vinyl karpet = kptVinyl.get(index);
                        kptVinyl.remove(index);
                        System.out.println("Data karpet dengan indeks " + index + " berhasil dihapus:");
                        System.out.println(karpet);
                    }
                }else if(menu == 2){
                    System.out.print("Masukkan merk karpet yang ingin dihapus: ");
                    carimerk = br.readLine();
                    index = search(carimerk,pil);
                    if (index == -1) {
                        System.out.println("Indeks tidak ditemukan!");
                    } else {
                        Vinyl karpet = kptVinyl.get(index);
                        kptVinyl.remove(index);
                        System.out.println("Data karpet dengan indeks " + index + " berhasil dihapus:");
                        System.out.println(karpet);
                    }
                }else{
                    System.out.println("Pilihan menu tidak ada!");
                }
            }
        }
        froze();
    }

    public static void main(String[] args) throws IOException {
        //clear();
        while (true) {
            System.out.println("=============== MENU KARPET YUNO ===============");
            System.out.println("1. Tambah data karpet");
            System.out.println("2. Lihat data karpet");
            System.out.println("3. Ubah data karpet");
            System.out.println("4. Hapus data karpet");
            System.out.println("5. Keluar");
            System.out.println("================================================");
            System.out.print("Pilih menu : ");
            int pilihan = Integer.parseInt(br.readLine());

            switch (pilihan) {
                case 1:
                    tambahDataKarpet();
                    break;
                case 2:
                    lihatDataKarpet();
                    break;
                case 3:
                    ubahDataKarpet();
                    break;
                case 4:
                    hapusDataKarpet();
                    break;
                case 5:
                    System.out.println("Program Dihentikan...");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada...");
                    froze();
            }
        }
    }
}
