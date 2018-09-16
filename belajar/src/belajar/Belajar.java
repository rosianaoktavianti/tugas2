/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

/**
 *
 * @author admin
 */
public class Belajar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //   char gender = 'm';
   // if (gender == 'L'||gender == 'l'||gender =='M'||gender == 'm'){
     //   System.out.println("Laki-Laki");
   // }
    //else if(gender == 'p'||gender == 'P'||gender == 'F'|| gender == 'f'){
      //  System.out.println("Perempuan");
    //}
    //else{
      //  System.out.println("tidak valid");
      //new
      
    //  int usia = 23;
      //String paras = "kurus";
      //if(usia >= 23 && paras == "gendut"){
        //System.out.println("Saya mau menikah");
    //}
      //else{
        //      System.out.println("Saya tidak mau menikah");
          //    }
          
          //tugas percabangan
          int nilaiAndroid = 50;
        String wajah = "cantik";
        String asal = "surabaya";
        

        System.out.println("Apakah mau menikah?");
        
        char nilaiandroidhuruf;
        if(nilaiAndroid >= 85){
            nilaiandroidhuruf = 'A';
        }
        else if(nilaiAndroid >= 75){
            nilaiandroidhuruf = 'B';
        }
        else if(nilaiAndroid >= 65){
           nilaiandroidhuruf = 'C';
        }
        else if(nilaiAndroid >= 55){
            nilaiandroidhuruf = 'D';
        }
        else{
            nilaiandroidhuruf = 'E';
        }
        
        
        if(nilaiandroidhuruf == 'A' && wajah == "cantik" && asal == "malang"){
            System.out.println("Mau banget dong");
        }
        else if((nilaiandroidhuruf == 'A' || nilaiandroidhuruf == 'C') && wajah == "cantik" && asal == "malang"){
            System.out.println("Bolehlah");  
        }
        else if(asal == "malang"){
            System.out.println("Saya pikir dulu");
        }
        else{
            System.out.println("Absolutely No");
        }
    }
    
}
    

