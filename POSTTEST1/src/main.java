import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main {
    static ArrayList<Karpet> karpetYuno = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        br.readLine();
    }

    // public final static void clear(){
    //     try
    //     {
    //         final String os = System.getProperty("os.name");
            
    //         if (os.contains("Windows"))
    //         {
    //             Runtime.getRuntime().exec("cls");
    //         }
    //         else
    //         {
    //             Runtime.getRuntime().exec("clear");
    //         }
    //     }
    //     catch (final Exception e)
    //     {
    //     }
    // }

    public static void tambahDataKarpet() throws IOException {
        clear();
        System.out.println("========== Masukkan Data Karpet ==========");
        System.out.print("Masukkan Model  : ");
        String model = br.readLine();
        System.out.print("Masukkan Warna  : ");
        String warna = br.readLine();
        System.out.print("Masukkan Ukuran : ");
        String ukuran = br.readLine();
        System.out.println("==========================================");
        karpetYuno.add(new Karpet(model, warna, ukuran));
        System.out.println("Data karpet " + model + " berhasil ditambahkan!");
        froze();
    }

    public static void lihatDataKarpet() throws IOException {
        clear();
        if (karpetYuno.isEmpty()) {
            System.out.println("Belum ada data yang tersimpan!");
        } else {
            System.out.println("=========== List Data Karpet ===========");
            for (Karpet karpet : karpetYuno) {
                System.out.println(karpet);
                System.out.println();
            }
            System.out.println("========================================");
        }
        froze();
    }

    public static void ubahDataKarpet() throws IOException {
        clear();
        if (karpetYuno.isEmpty()) {
            System.out.println("Belum ada data yang tersimpan!");
        } else {
            System.out.print("Masukkan indeks data karpet yang ingin diubah: ");
            int index = Integer.parseInt(br.readLine());
            if (index < 0 || index >= karpetYuno.size()) {
                System.out.println("Indeks tidak ditemukan!");
            } else {
                Karpet karpet = karpetYuno.get(index);
                System.out.println("Data karpet dengan indeks " + index);
                System.out.println(karpet);
                System.out.println("======= Masukkan data karpet yang baru =======");
                System.out.print("Masukkan Model  : ");
                String model = br.readLine();
                System.out.print("Masukkan Warna  : ");
                String warna = br.readLine();
                System.out.print("Masukkan Ukuran : ");
                String ukuran = br.readLine();
                System.out.println("==============================================");
                karpet.setModel(model);
                karpet.setWarna(warna);
                karpet.setUkuran(ukuran);
                System.out.println("Data karpet berhasil diubah!");
            }
        }
        froze();
    }

    public static void hapusDataKarpet() throws IOException {
        clear();
        if (karpetYuno.isEmpty()) {
            System.out.println("Belum ada data yang tersimpan!");
        } else {
            System.out.print("Masukkan indeks data karpet yang ingin dihapus: ");
            int index = Integer.parseInt(br.readLine());
            if (index < 0 || index >= karpetYuno.size()) {
                System.out.println("Indeks tidak ditemukan!");
            } else {
                Karpet karpet = karpetYuno.get(index);
                karpetYuno.remove(index);
                System.out.println("Data karpet dengan indeks " + index + " berhasil dihapus:");
                System.out.println(karpet);
            }
        }
        froze();
    }

    public static void main(String[] args) throws IOException {
        clear();
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