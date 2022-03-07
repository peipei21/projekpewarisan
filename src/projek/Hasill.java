/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Hasill {
    public static void main(String[] args) {
        siswaa s=new siswaa();
        Scanner scan=new Scanner(System.in);
        System.out.println("---Data Siswa Baru---");
        System.out.println("Nama Siswa: ");
        String nama=scan.nextLine();
        System.out.println("Jenis Kelamin: ");
        String jk=scan.nextLine();
        System.out.println("Nomor INSN");
        int NoINSN=scan.nextInt();
        s.JurusanKeahlian();
        System.out.println("Biaya Gelombang 1: "+s.Uangyangharusdibayar(100000));
        System.out.println("Biaya Gelombang 2: "+s.Uangyangharusdibayar(100000)*2);
    }
}
