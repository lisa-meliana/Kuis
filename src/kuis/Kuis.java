/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.util.Scanner;
import devisi.Web;
import devisi.Android;
/**
 *
 * @author Lisa Meliana
 */
public class Kuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nilaiTes, nilaiCoding, nilaiWawancara;
        String nik;
        String nama;
      
        
        Scanner input = new Scanner(System.in);
        char pilih, pilihan;
        
            System.out.println("FORM PENDAFTARAN PT.UDIN");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("Pilih Jenis Form : ");
            pilih = input.next().charAt(0);
            
            if (pilih == '1' || pilih=='2'){
               System.out.println("\nFORM PENDAFTAN");
                System.out.print("Input NIK\t:");
                nik = input.next();
                System.out.print("Input Nama\t:");
                input.nextLine();
                nama = input.nextLine();
                System.out.print("Input Nilai Tes Tulis\t:");
                nilaiTes = input.nextInt();
                System.out.print("Input Nilai Tes Coding\t:");
                nilaiCoding = input.nextInt();
                System.out.print("Input Nilai Tes Wawancara\t:");
                nilaiWawancara = input.nextInt();
                
                if (pilih =='1'){
                    Android pendaftar = new Android(nik, nama, nilaiTes, nilaiCoding, nilaiWawancara);
                    while(true){
                        System.out.print("Menu\t:");
                        System.out.println("\n1. Edit");
                        System.out.println("2. Tampil");
                        System.out.println("3. Exit");
                        System.out.print("Pilih Jenis Form : ");
                        pilihan = input.next().charAt(0);
                        
                        if (pilihan =='1'){
                            System.out.print("FORM EDIT\t:");
                            System.out.print("\nInput Nilai Tes Tulis\t:");
                            nilaiTes = input.nextInt();
                            System.out.print("Input Nilai Tes Coding\t:");
                            nilaiCoding = input.nextInt();
                            System.out.print("Input Nilai Tes Wawancara\t:");
                            nilaiWawancara = input.nextInt();
                            pendaftar.edit(nilaiTes, nilaiCoding, nilaiWawancara);
                            pendaftar.hitungRata();
                        }
                        else if (pilihan =='2'){
                            pendaftar.hasil();
                        }
                        else if (pilihan == '3'){
                            break;
                        }
                    }
                }
                else if (pilih == '2'){
                    Web pendaftar = new Web(nik, nama, nilaiTes, nilaiCoding, nilaiWawancara);
                     while(true){
                        System.out.print("Menu\t:");
                        System.out.println("\n1. Edit");
                        System.out.println("2. Tampil");
                        System.out.println("3. Exit");
                        System.out.print("Pilih Jenis Form : ");
                        pilihan = input.next().charAt(0);
                        
                        if (pilihan =='1'){
                            System.out.print("FORM EDIT\t:");
                            System.out.print("\nInput Nilai Tes Tulis\t:");
                            nilaiTes = input.nextInt();
                            System.out.print("Input Nilai Tes Coding\t:");
                            nilaiCoding = input.nextInt();
                            System.out.print("Input Nilai Tes Wawancara\t:");
                            nilaiWawancara = input.nextInt();
                            pendaftar.edit(nilaiTes, nilaiCoding, nilaiWawancara);
                            pendaftar.hitungRata();
                        }
                        else if (pilihan =='2'){
                            pendaftar.hasil();
                        }
                        else if (pilihan == '3'){
                            break;
                        }
                    }
                }
            }
            else{
                System.out.println("input tidak ada.");
            }
    }
}
          
         
            
              
               
