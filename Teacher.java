//NAMA  : ARI PERDIAN
//NIM   : 20220040072
//KELAS : TI22J

public class Teacher extends Person {
    private int jumlahMataKuliah = 0;
    private String[] mataKuliah = new String[10];

    public Teacher(String nama, String alamat) {
        super(nama, alamat);
    }

    public boolean tambahMataKuliah(String mataKuliah) {
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (this.mataKuliah[i].equals(mataKuliah)) {
                return false; // Mata kuliah sudah ada
            }
        }
        this.mataKuliah[jumlahMataKuliah] = mataKuliah;
        jumlahMataKuliah++;
        return true;
    }

    public boolean hapusMataKuliah(String mataKuliah) {
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (this.mataKuliah[i].equals(mataKuliah)) {
                for (int j = i; j < jumlahMataKuliah - 1; j++) {
                    this.mataKuliah[j] = this.mataKuliah[j + 1];
                }
                this.mataKuliah[jumlahMataKuliah - 1] = null;
                jumlahMataKuliah--;
                return true; // Mata kuliah berhasil dihapus
            }
        }
        return false; // Mata kuliah tidak ditemukan
    }

    public String toString() {
        return "Dosen: " + super.toString();
    }
}