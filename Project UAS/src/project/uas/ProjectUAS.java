
package project.uas;

import java.util.Scanner;

public class ProjectUAS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("SELAMAT DATANG DI APLIKASI ONLINE SHOPPING");
        System.out.println();
        System.out.println("1. Produk 1");
        System.out.println("2. Produk 2");
        System.out.println("3. Produk 3");
        System.out.println();
        System.out.println("Silahkan pilih produk yang ingin anda beli: ");   
        int produk = input.nextInt();
        
        switch (produk){
            case 1 : 
                System.out.println("Produk 1"); 
                break;
            case 2 : 
                System.out.println("Produk 2"); 
                break;
            case 3 : 
                System.out.println("Produk 3"); 
                break;
        }
        
        System.out.println("Masukkan alamat anda (batam atau luar batam: ");
        String alamat = input.nextLine();
        String batam = input.nextLine();
        
        if (alamat.equals(batam)){
            System.out.println("Ongkos kirim 10 ribu");
        } else {
            System.out.println("Ongkos kirim 30 ribu");
        }
    }
}
