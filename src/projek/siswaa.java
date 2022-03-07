
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek;

/**
 *
 * @author asus
 */
public class siswaa extends Sekolah{
    public String nama,jk;
    public int NoINSN;
    public int BiayaPendaftaran;
    //overriding
    public void IdentitasSiswa(){
        System.out.println("Nama: "+nama);
        System.out.println("Jenis Kelamin: "+jk);
        System.out.println("Nomer Induk: "+NoINSN);
    }
    public void JurusanKeahlian(){
        System.out.println("Jurusan keahlian: "+super.jurusan);
    }
    //overloading
    public int Uangyangharusdibayar(int BiayaPendaftaran){
        this.BiayaPendaftaran=BiayaPendaftaran;
        return BiayaPendaftaran;
    }
    public void Uangyangharusdibayar(double BiayaPendaftaranGelombang2){
        System.out.println("Biaya pendaftaran gelombang 2: "+BiayaPendaftaranGelombang2);
    }
}
