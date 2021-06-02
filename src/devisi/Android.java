/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devisi;

/**
 *
 * @author Lisa Meliana
 */
public class Android extends Development implements MenghitungRata{
      private double nilaiAkhir;

    public Android(String nik, String nama, int nilaiTes, int nilaiCoding, int nilaiWawancara) {
        super(nik, nama, nilaiTes, nilaiCoding, nilaiWawancara);
        hitungRata();
    }
      
    
    @Override
    public double hitungRata() {
        return nilaiAkhir = ((nilaiTes*0.2) + (nilaiCoding*0.5) + (nilaiWawancara*0.3));
    }

    @Override
    public void hasil() {
        System.out.println("Nilai Akhir\t: "+nilaiAkhir);
        if (nilaiAkhir>=85){
            System.out.println("Keterangan\t: Lolos");
            System.out.println("Selamat kepada " + getNama() + " telah diterima sebagai android");
        }
        else{
            System.out.println("Keterangan\t: gagal");
            System.out.println("selamat kepada " + getNama() + " telah ditolak sebagai android");
        }
    }


 
    }


    
