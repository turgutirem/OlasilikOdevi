package olasilikodevi;
import java.math.BigInteger;
import java.util.*;


/**
 *
 * @author gm_sa
 */
public class FonksiyonManager {
    public void RastgeleSayiUret() {
        System.out.println("**************Rastgele Sayi Uretme******************");
        System.out.println("****************************************************");
        Scanner scanner = new Scanner(System.in);
        int min, max, n, temp,sayi;
        Random rand = new Random();
        // Baslangic Degeri
        System.out.print("Lütfen Başlangıç Degerini Giriniz : ");
        min = scanner.nextInt();
        System.out.println();
        // Bitiş Degeri
        System.out.print("Lütfen Bitiş Degerini Giriniz : ");
        max = scanner.nextInt();
        System.out.println();
        // Eleman sayısı
        System.out.print("Lütfen Kaç Sayı üretmenk İstediğinizi Giriniz : ");
        n = scanner.nextInt();
        System.out.println();
        temp = (max - min) + 1;
        int random = rand.nextInt(temp) + min;
        
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(random);
        
        
        if((max-min)<n){ 
            for (int i = 1; i < n; i++) {   
                random=rand.nextInt(temp)+min;
                arr.add(random);
            }
        }
        else {
            for (int i = 1; i < n; i++) {
               random=rand.nextInt(temp)+min;
               if(arr.indexOf(random)>-1){
                   i--;
               }
               else{
                   arr.add(random);
               }
            }
        }
        System.out.print("Sayilar : ");
        System.out.println(" "+arr.toString());
        
    }

    public void SistematikRastgeleOrnekleme() {
        System.out.println("**************Sistematik Rastgele Örnekleme******************");
        System.out.println("*************************************************************");
        int N, n, a, k;
        Scanner scanner = new Scanner(System.in);

        System.out.print("N(Örneklem) değerini giriniz : ");
        N = scanner.nextInt();
        System.out.print("n(Kitle) değerini giriniz : ");
        n = scanner.nextInt();

        k = (N / n);

        Random random = new Random();
        a = random.nextInt(k);

        while (a == 0) {
            a = random.nextInt(k);
        }
        System.out.println("*******************************");
        System.out.println("k sayısı : " + k);
        System.out.println("a sayısı : " + a);
        System.out.println("*******************************");
        System.out.print(a + " ");
        for (int i = 1; i < n; i++) {
            System.out.print((a + (i * k)) + " ");

        }

    }

    public void BasitSeri() {
        System.out.println("**************Basit Seri******************");
        System.out.println("******************************************");
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Kaç adet veri girmek istiyorsunuz : ");
        n = scanner.nextInt();
        System.out.println("**********************************");
        Integer[] dizi = new Integer[n];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + "'inci elemanı giriniz : ");
            dizi[i] = scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
            for (int x = n - 1; x > 0; x--) {
                if (dizi[x] < dizi[x - 1]) {
                    int temp = dizi[x];
                    dizi[x] = dizi[x - 1];
                    dizi[x - 1] = temp;
                }
            }
        }
        System.out.print("************************************\n");
        System.out.print("Sayilar : [");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + " ");
            
        }
        System.out.println("]");

    }

    public void FrekansSerisi() {
        int n = 0, i = 0, sayac2 = 0, sayac, sayi;
        ArrayList<Integer> yeni = new ArrayList();
        ArrayList<Integer> dizi = new ArrayList();
        ArrayList<Integer> frekans = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        System.out.println("**********Frekans Serisi***********");
        System.out.print("Kaç tane veri girmek istiyorsunuz ? :");
        n = scanner.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print((i + 1) + "'inci elemanı giriniz :");
            sayi = scanner.nextInt();
            dizi.add(i, sayi);
        }

        Collections.sort(dizi);
        System.out.println("**********************************");
        System.out.print("Dizi => ");
        for (int j = 0; j < dizi.size(); j++) {
            System.out.print(dizi.get(j) + " ");
        }
        System.out.println("\n**********************************");
        yeni.add(0, dizi.get(0));

        // tekrar edenleri silme
        for (int j = 1; j < dizi.size(); j++) {
            sayac = 0;
            for (int k = 0; k < yeni.size(); k++) {
                if (yeni.get(k) == dizi.get(j)) {
                    break;
                } else {
                    sayac++;
                    if (sayac == yeni.size()) {
                        yeni.add(yeni.size(), dizi.get(j));
                    }
                }
            }
        }
        //dizideki her elemanın tekrar sayısını bulma
        for (int j = 0; j < dizi.size(); j++) {
            for (int k = 0; k < dizi.size(); k++) {
                if (dizi.get(j) == dizi.get(k)) {
                    for (int l = 0; l < j; l++) {
                        if (dizi.get(l) == dizi.get(j)) {
                            sayac2 = -1;
                        }
                    }
                    sayac2++;
                }
            }
            if (sayac2 != 0)
                frekans.add(sayac2);
            sayac2 = 0;
        }


        System.out.println("\n\n" + "xi      fi");

        for (int j = 0; j < yeni.size(); j++) {

            System.out.println(yeni.get(j) + "       " + frekans.get(j));

        }

    }

    public void FrekansTablosu() {
        System.out.println("**************Frekans Tablosu******************");
        System.out.println("***********************************************");
        Scanner scanner = new Scanner(System.in);
        double limitAlt;
        double limitUst;
        double altSinifSiniriSayi;
        int sayac;
        double ustSinifSiniriSayi;


        int adet;
        int sayi;
        System.out.print("Adet Giriniz : ");
        adet = scanner.nextInt();
        int[] sayilar = new int[adet];
        System.out.println("***********************************************");
        for (int i = 0; i < adet; i++) {
            System.out.print((i + 1) + ".Sayıyı giriniz : ");
            sayi = scanner.nextInt();
            sayilar[i] = sayi;
        }
        System.out.println("***********************************************");
        Arrays.sort(sayilar);
        System.out.print("Sayılar : ");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ,");
        }
        
        System.out.print("\n********************************************\n");
        int min = Arrays.stream(sayilar).min().getAsInt();
        int max = Arrays.stream(sayilar).max().getAsInt();
        int r = max - min;

        double k = (double) (Math.sqrt(adet));
        k = Math.ceil(k);
        double h = r / k;
        h = Math.ceil(h);

        System.out.println("------------ Sınıf Limitleri --------------");
        System.out.println("Alt\n");
        limitAlt = Arrays.stream(sayilar).min().getAsInt();


        double[] sinifAltLimit = new double[(int) k];
        sinifAltLimit[0] = limitAlt;
        System.out.println(limitAlt);
        for (int i = 1; i <= k - 1; i++) {
            limitAlt += (int) h;
            System.out.println(limitAlt);
            sinifAltLimit[i] = limitAlt;
        }
        System.out.print("\nÜst\n");
        double[] sinifUstLimit = new double[(int) k];
        sinifUstLimit[0] = sinifAltLimit[1] - 1;
        limitUst = sinifUstLimit[0];
        System.out.print(sinifUstLimit[0] + "\n");
        for (int i = 1; i <= k - 1; i++) {
            limitUst += (int) h;
            System.out.println(limitUst);
            sinifUstLimit[i] = limitUst;
        }
        
        System.out.print("********************************************\n");
        System.out.print("------------ Sınıf Sınıfları --------------\n");
        double[] altSinifSiniri = new double[(int) k];
        altSinifSiniri[0] = sinifAltLimit[0] - 0.5;
        altSinifSiniriSayi = altSinifSiniri[0];
        System.out.print("Alt\n");
        System.out.println(altSinifSiniriSayi);
        for (int i = 1; i <= k - 1; i++) {
            altSinifSiniriSayi += (int) h;
            System.out.println(altSinifSiniriSayi);
            altSinifSiniri[i] = altSinifSiniriSayi;
        }
        double[] ustSinifSiniri = new double[(int) k];
        ustSinifSiniri[0] = sinifUstLimit[0] + 0.5;
        ustSinifSiniriSayi = ustSinifSiniri[0];
        System.out.print("\nÜst\n");
        System.out.println(ustSinifSiniriSayi);

        for (int i = 1; i <= k - 1; i++) {
            ustSinifSiniriSayi += (int) h;
            System.out.println(ustSinifSiniriSayi);
            ustSinifSiniri[i] = ustSinifSiniriSayi;
        }


        System.out.print("********************************************\n");
        System.out.print("------------ Sınıf Frekansı --------------\n");
        int[] sinifFrekansi = new int[(int) k];
        for (int i = 0; i <= k - 1; i++) {
            double ilk = altSinifSiniri[i];
            double son = ustSinifSiniri[i];
            sayac = 0;
            for (int j = 0; j < sayilar.length; j++) {
                if (ilk <= sayilar[j] & son >= sayilar[j]) {
                    sayac++;
                }
                sinifFrekansi[i] = sayac;

            }
            System.out.println(sinifFrekansi[i]);
        }

        
        System.out.print("********************************************\n");
        System.out.print("------------ Sınıf Orta Noktası --------------\n");
        double[] sinifOrtaNokta = new double[(int) k];
        for (int i = 0; i <= k - 1; i++) {
            sinifOrtaNokta[i] = ((double) sinifAltLimit[i] + (double) (sinifUstLimit[i])) / 2;
            System.out.println(sinifOrtaNokta[i]);
        }

       
        System.out.print("********************************************\n");
        System.out.print("------------ Eklenik Frekans --------------\n");
        double[] eklenikFrekans = new double[(int) k];
        eklenikFrekans[0] = sinifFrekansi[0];
        System.out.println(eklenikFrekans[0]);
        for (int i = 1; i <= k - 1; i++) {
            eklenikFrekans[i] = eklenikFrekans[i - 1] + sinifFrekansi[i];
            System.out.println(eklenikFrekans[i]);

        }

        
        System.out.print("********************************************\n");
        System.out.print("------------ Oransal Frekans --------------\n");
        double[] oransalFrekans = new double[(int) k];
        for (int i = 0; i <= k - 1; i++) {
            //oransalFrekans[i] = (double)sinifFrekansi[i] / (double)adet;
            System.out.println((double) sinifFrekansi[i] + "/" + (double) adet);
        }

       
        System.out.print("********************************************\n");
        System.out.print("------------ Oransal Eklenik Frekans --------------\n");
        double[] oransalEklenikFrekans = new double[(int) k];
        for (int i = 0; i <= k - 1; i++) {
            //oransalEklenikFrekans[i] = (double)eklenikFrekans[i] / (double)adet;
            System.out.println((double) eklenikFrekans[i] + " / " + (double) adet);
        }


    }

    public void MerkeziEgilimOlculeri() {
        System.out.println("**************Merkezi Eğilim Ölçüleri******************");
        System.out.println("*******************************************************");
        Scanner scanner = new Scanner(System.in);
        int n;
        int toplam = 0;
        double ort;
        double medyan;
        int enFazlaOlan = -1;
        int enFazlaOlanSayi = -1;
        int tekrarlamaSayisi = 0;

       
        
        System.out.print("Kaç tane veri girmek istiyorsunuz : ");
        n = scanner.nextInt();
        System.out.println("*******************************************************");
        Integer[] dizi = new Integer[n];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + "'inci elemanı giriniz : ");
            dizi[i] = scanner.nextInt();
        }


        //diziyi sıralıyoruz.
        for (int j = 0; j < n; j++) {
            for (int x = n - 1; x > 0; x--) {
                if (dizi[x] < dizi[x - 1]) {
                    int temp = dizi[x];
                    dizi[x] = dizi[x - 1];
                    dizi[x - 1] = temp;
                }
            }
        }
        System.out.println("*******************************************************");
        // sıralı halini ekrana bastırdık.
        System.out.print("Sayilar : [");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + " ");
        }

        System.out.println("] ");

        //Aritmetik Ortalama Hesaplama
        for (int i = 0; i < n; i++) {
            toplam = dizi[i] + toplam;
        }

        ort = (double) toplam / n;

        
        //Medyan Hesaplama
        if (n % 2 == 0) {
            int b = n / 2;
            int c = b - 1;
            medyan = (double) (dizi[b] + dizi[c]) / 2;
            System.out.println("*******************************************************");
            System.out.println("Girmiş Olduğunuz Dizinin Medyan'ı : " + medyan);
        }

        if (n % 2 == 1) {
            int a = n / 2;
            medyan = dizi[a];
            System.out.println("*******************************************************");
            System.out.println("Girmiş Olduğunuz Dizinin Medyan'ı : " + medyan);
        }

        //Mod Hesaplama
        for (int i = 0; i < n; ++i) {
            int sayici = 0;
            for (int k = 0; k < n; ++k) {
                if (dizi[k] == dizi[i]) {
                    ++sayici;
                }
            }
            if (sayici > tekrarlamaSayisi) {
                tekrarlamaSayisi = sayici;
                enFazlaOlanSayi = dizi[i];
            }
        }
        System.out.println("*******************************************************");
        System.out.println("Girmiş Olduğunuz Dizinin Mod'u : " + enFazlaOlanSayi);
        System.out.println("*******************************************************");
        System.out.println("Aritmetik Ortalama = " + ort);
    }

    public void DagilimOlculeri() {
        System.out.println("**************Dağılım Ölçüleri******************");
        System.out.println("***********************************************");
        Scanner scanner = new Scanner(System.in);
        int n;
        double q3;
        double sonucQ3;
        double q1;
        double sonucQ1;

        System.out.print("Kaç adet veri girmek istiyorsunuz : ");
        n = scanner.nextInt();
        System.out.println("***********************************************");
        Double[] dizi = new Double[n];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + "'inci elemanı giriniz : ");
            dizi[i] = scanner.nextDouble();
        }
        System.out.println("***********************************************");

        for (int j = 0; j < n; j++) {
            for (int x = n - 1; x > 0; x--) {
                if (dizi[x] < dizi[x - 1]) {
                    double temp = dizi[x];
                    dizi[x] = dizi[x - 1];
                    dizi[x - 1] = temp;
                }
            }
        }

        //Aritmetik Ortlama Hesaplama
        double artort = 1;
        double toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam = dizi[i] + toplam;
        }
        artort = toplam / dizi.length;

        //Varyans Hesaplama
        double varyans = 0;
        for (int i = 0; i < n; i++) {
            varyans = varyans + (dizi[i] - artort) * (dizi[i] - artort);
        }
        varyans = varyans / (n - 1);

        System.out.println("Art ort : " + artort);
        System.out.println("***********************************************");
        System.out.println("Varyans : " + varyans);
        System.out.println("***********************************************");

        //Standart Sapma Hesaplama
        double StandartSapma = Math.sqrt(varyans);
        System.out.println("Standart Sapma : " + StandartSapma);
        System.out.println("***********************************************");

        //OMS Hesaplama
        double oms = 0;
        for (int i = 0; i < n; i++) {
            oms = oms + Math.abs(dizi[i] - artort);
        }
        oms = oms / n;

        System.out.println("Ortalama Mutlak Sapma : " + oms);
        System.out.println("***********************************************");

        // q1
        q1 = (n + 1) * 0.25;
        double kucukDeger1 = Math.floor(q1);
        double buyukDeger1 = Math.ceil(q1);
        sonucQ1 = dizi[(int)(buyukDeger1 - 1)] + (0.75 * (dizi[(int) (buyukDeger1 - 1)] - dizi[(int) (kucukDeger1 - 1)]));
        // q3
        q3 = (n + 1) * 0.75;
        double kucukDeger3 = Math.floor(q3);
        double buyukDeger3 = Math.ceil(q3);
        sonucQ3 = dizi[(int)(buyukDeger3 - 1)] + (0.25 * (dizi[(int)(buyukDeger3 - 1)] - dizi[(int)(kucukDeger3 - 1)]));


        System.out.println("SonuçQ1 = "+ sonucQ1);
        System.out.println("SonuçQ3 = "+ sonucQ3);
        System.out.println("***********************************************");
        //Değişim Katsayısı Hesaplama
        double dK = 0;
        dK = (StandartSapma / artort);

        System.out.println("Değişim Katsayısı : " + dK);
        System.out.println("***********************************************");

    }

    static BigInteger factorial(int N)
    {
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
    public void Permutasyon_Kombinasyon(){
        System.out.println("**************Permütasyon / Kombinasyon******************");
        System.out.println("*********************************************************");
        int n;
        int r;
        BigInteger nFak ;
        BigInteger nrFak;
        BigInteger rFak;
        BigInteger permütasyon;
        BigInteger kombinasyon;
        BigInteger rcarpınr;

        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini giriniz : ");
        n = scanner.nextInt();
        System.out.print("r değerini giriniz : ");
        r = scanner.nextInt();

        nFak = factorial(n);
        nrFak = factorial((n-r));
        rFak = factorial(r);

        permütasyon = nFak.divide(nrFak);

        rcarpınr = rFak.multiply(nrFak);
        kombinasyon = nFak.divide(rcarpınr);
        System.out.println("*********************************************************");
        System.out.println("Kombinasyon Sonucu : " + kombinasyon);
        System.out.println("Permütasyon Sonucu : " + permütasyon);
    }
}
