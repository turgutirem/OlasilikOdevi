package olasilikodevi;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class OlasilikOdevi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int secim;
        String cikis;
        boolean T=true;
        Scanner scanner=new Scanner(System.in);
        FonksiyonManager fonksiyonManager=new FonksiyonManager();
        System.out.println("*************************************");
        System.out.println("------Olasılık Ve İstatistik---------");
        System.out.println("*************************************");
        System.out.println("--------------------------> İşlemler ");
        System.out.println("1-) Rastgele Sayı üretme \n" +
                "2-) Sistematik Sayı Üretme \n" +
                "3-) Basit Seri \n" +
                "4-) Frekans Serisi \n" +
                "5-) Frekans Tablosu \n" +
                "6-) Merkezi Eğilim Ölçüleri \n" +
                "7-) Dağılım Ölçüleri \n" +
                "8-) Permütasyon Kombinasyon \n"+
                "9-) Çıkış \n");
        System.out.println("*************************************");
        while(T) {
            System.out.print(" İşlem : ");
            secim=scanner.nextInt();
            System.out.println("\n");
            switch (secim) {
                case 1:
                    fonksiyonManager.RastgeleSayiUret();
                    System.out.println("\n*************************************\n");
                    break;

                case 2:
                    fonksiyonManager.SistematikRastgeleOrnekleme();
                    System.out.println("\n*************************************\n");
                    break;
                case 3:
                    fonksiyonManager.BasitSeri();
                    System.out.println("\n*************************************\n");
                    break;
                case 4:
                    fonksiyonManager.FrekansSerisi();
                    System.out.println("\n*************************************\n");
                    break;
                case 5:
                    fonksiyonManager.FrekansTablosu();
                    System.out.println("\n*************************************\n");
                    break;
                case 6:
                    fonksiyonManager.MerkeziEgilimOlculeri();
                    System.out.println("\n*************************************\n");
                    break;
                case 7:
                    fonksiyonManager.DagilimOlculeri();
                    System.out.println("\n*************************************\n");
                    break;
                case 8:
                    fonksiyonManager.Permutasyon_Kombinasyon();
                    System.out.println("\n*************************************\n");
                    break;
                case 9:
                    T = false;
                    break;
            }
        }
        System.out.println("");
        System.out.println("Çıkış için x e bas : ");
        cikis = scanner.next();
    }
    }
    

