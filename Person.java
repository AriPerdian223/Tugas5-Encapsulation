//NAMA  : ARI PERDIAN
//NIM   : 20220040072
//KELAS : TI22J

public class Person {
    private String nama;
    private String alamat;
    
    public Person(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String toString(){
        return nama + "(" + alamat + ")";
    }
}
