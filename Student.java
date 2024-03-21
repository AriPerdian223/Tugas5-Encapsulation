//NAMA  : ARI PERDIAN
//NIM   : 20220040072
//KELAS : TI22J

public class Student extends Person {
    private int jumlahMataKuliah = 0;
    private String[] mataKuliah = new String[10];
    private int[] nilai = new int[10];
    
    public Student(String nama, String alamat){
        super(nama, alamat);
    }
    
    public void tambahMataKuliahDanNilai(String mataKuliah, int nilai){
        this.mataKuliah[jumlahMataKuliah] = mataKuliah;
        this.nilai[jumlahMataKuliah] = nilai;
        jumlahMataKuliah++;
    }
    
    public void tampilkanNilai(){
        System.out.println("Nilai untuk " + getNama() + ":");
        for (int i = 0 ; i < jumlahMataKuliah; i++) {
            System.out.println(mataKuliah[i] + ":" + nilai[i]);      
        }
    }
    
    public double hitungRataRataNilai() {
        if (jumlahMataKuliah == 0) return 0;
        int total = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            total += nilai[i];
        }
        return (double) total / jumlahMataKuliah;
    }

    public String toString() {
        return "Mahasiswa: " + super.toString();
    }
}
