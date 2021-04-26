import java.util.Scanner;
class DataUniv{
    static String univ;
    static void setUniv(String univ){
        DataUniv.univ = univ;
    }
    static String getUniv(){
        return univ;
    }
}
class DataMhs extends DataUniv{
    Scanner ketik = new Scanner(System.in);
    String nim, nama, alamat, jurusan;
    int nomor;
    DataMhs(int nomor){
        this.nomor = nomor;
    }
    void inputData(){
        System.out.print("Masukkan NIM: ");
        this.nim = ketik.nextLine();
        System.out.print("Masukkan Nama: ");
        this.nama = ketik.nextLine();
        System.out.print("Masukkan Alamat: ");
        this.alamat = ketik.nextLine();
        System.out.println("Daftar Jurusan: ");
        System.out.println("61. Matematika\n62. Biologi");
        System.out.println("63. Kimia\n64. Fisika");
        System.out.println("65. Teknik Informatika");
        System.out.println("66. Sistem Informasi");
        int lo = 0;
        while(lo==0){
            System.out.print("Masukkan Kode Jurusan: ");
            String jur = ketik.nextLine();
            switch (jur){
                case "61":
                    this.jurusan = "Matematika";
                    lo = 1;
                    break;
                case "62":
                    this.jurusan = "Biologi";
                    lo = 1;
                    break;
                case "63":
                    this.jurusan = "Kimia";
                    lo = 1;
                    break;
                case "64":
                    this.jurusan = "Fisika";
                    lo = 1;
                    break;
                case "65":
                    this.jurusan = "Teknik Informatika";
                    lo = 1;
                    break;
                case "66":
                    this.jurusan = "Sistem Informasi";
                    lo = 1;
                    break;
            }
        }
    }
    void outputData(){
        System.out.println("\n<=== Data Mahasiswa ===>");
        System.out.println("Universitas : "+getUniv());
        System.out.println("NIM         : "+this.nim);
        System.out.println("Nama        : "+this.nama);
        System.out.println("Alamat      : "+this.alamat);
        System.out.println("Jurusan     : "+this.jurusan+"\n");
    }
}
public class ModulTiga {
    public static void main(String[] args){
        Scanner ketik = new Scanner(System.in);
        System.out.print("Masukkan Nama Universitas: ");
        String iUniv = ketik.nextLine();
        DataUniv.setUniv(iUniv);
        int no = 0;
        DataMhs mhs1 = new DataMhs(1);
        while(no==0){
            mhs1.inputData();
            mhs1.outputData();
            int no2 = 0;
            while (no2==0){
                System.out.println("Apakah Anda ingin memasukkan data lagi?");
                System.out.print("(Y)Ya; (T)Tidak => ");
                String lg = ketik.nextLine();
                switch (lg){
                    case "Y":
                        no2 = 1;
                        break;
                    case "T":
                        no = 1;
                        no2 = 1;
                        break;
                }
            }
            System.out.println("");
        }
    }
}