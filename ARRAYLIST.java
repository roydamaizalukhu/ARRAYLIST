import java.util.ArrayList;
import java.util.Scanner;

public class ARRAYLIST {

    public static void main(String[] args) {
        
        ArrayList<String> jalurOperasional = new ArrayList<>();
        jalurOperasional.add("Sukabumi");
        jalurOperasional.add("Cianjur");
        jalurOperasional.add("Bandung");
        jalurOperasional.add("Garut");
        jalurOperasional.add("Tasik");
        jalurOperasional.add("Ciamis");
        jalurOperasional.add("Banjar");
        
        double[][] tarif = {
            {0, 10000, 0, 0, 0, 0, 0},
            {0, 0, 15000, 0, 0, 0, 0},
            {0, 0, 0, 7500, 0, 0, 0},
            {0, 0, 0, 0, 5000, 0, 0},
            {0, 0, 0, 0, 0, 7500, 0},
            {0, 0, 0, 0, 0, 0, 6000},
            {0, 0, 0, 0, 0, 0, 0}
        };
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kota keberangkatan: ");
        String kotaKeberangkatan = scanner.nextLine();
        
        while (!jalurOperasional.contains(kotaKeberangkatan)) {
            System.out.println("Kota keberangkatan tidak valid.");
            System.out.print("Kota keberangkatan: ");
            kotaKeberangkatan = scanner.nextLine();
        }
        
        System.out.print("Kota tujuan: ");
        String kotaTujuan = scanner.nextLine();
        
        while (!jalurOperasional.contains(kotaTujuan)) {
            System.out.println("Kota tujuan tidak valid.");
            System.out.print("Kota tujuan: ");
            kotaTujuan = scanner.nextLine();
        }
        
        double tarifPerjalanan = tarif[jalurOperasional.indexOf(kotaKeberangkatan)][jalurOperasional.indexOf(kotaTujuan)];
        double diskon = 0;
        
        if ((kotaKeberangkatan.equals("Sukabumi") && kotaTujuan.equals("Banjar")) || (kotaKeberangkatan.equals("Banjar") && kotaTujuan.equals("Sukabumi"))) {
            diskon = 0.05;
        }
        
        System.out.print("Apakah penumpang anggota TNI/POLRI? (y/n) ");
        String isAnggota = scanner.nextLine();
        
        if (isAnggota.equals("y")) {
            diskon = 0.1;
        }
        
        double harga = tarifPerjalanan - (tarifPerjalanan * diskon);
        
        System.out.println("Tarif perjalanan: Rp " + tarifPerjalanan);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Harga: Rp " + harga);
        
    }

}