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
abstract class Development {
         private String nik;
         private String nama;
         public int nilaiTes, nilaiCoding,nilaiWawancara;

    public Development(String nik, String nama, int nilaiTes, int nilaiCoding,int nilaiWawancara) {
        this.nik = nik;
        this.nama = nama;
        this.nilaiTes = nilaiTes;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
        
    }

    abstract void hasil();
    
    public void edit(int nilaiTes, int nilaiCoding,int nilaiWawancara){
        this.nilaiTes = nilaiTes;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
    
    public String getNama(){
        return nama;
    }

}

