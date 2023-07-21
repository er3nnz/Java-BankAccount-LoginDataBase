
import java.util.Scanner;


public class BankaProje {
    
    private double bakiye;
    private String HesapNo;
    private String Şifre;

    
    public void girişİslemi(String Şifre,String HesapNo){
        
        int denemehakkı=3;
        
        if(Şifre!=this.Şifre && HesapNo==this.HesapNo){
            System.out.println("Kullanicinin Sifresi Yanlis Hesap Numarasi Dogrudur Lutfen Sifrenizi Bir Daha Deneyiniz....");
            denemehakkı--;
            return;
        }
        else if(Şifre==this.Şifre && HesapNo!=this.HesapNo){
            System.out.println("Kullanicinin Sifresi Dogru Hesap Numarasi Yanlistir Lutfen Bir Daha Deneyiniz");
            denemehakkı--;
            return;
        }
        else if(Şifre==this.Şifre && HesapNo==this.HesapNo){
            System.out.println("Giris Islemi Basarilidir...");
            
            System.out.println("Lutfen Sisteme Hangi Islemi Yaptirmak Istediginizi Seciniz:\n"
            +"1:Para Cekme\n"
            +"2: Para Yatirma");
            
            Scanner scanner= new Scanner(System.in);
            int islem=scanner.nextInt();
            
            if(islem==1){
                int maks=1500;
                System.out.println("Lutfen Sistemden cekmek Istediginiz Para Miktarini Giriniz");
                
                int para=scanner.nextInt();
                if(para>bakiye){
                    System.out.println("Bakiye Yetersiz....");
                }
                else if(para>maks){
                    System.out.println("Gunluk Cekim Limitini Astiniz.....");
                }
                else {
                    setBakiye(bakiye - para);
                    System.out.println("Guncel Bakiye:"+bakiye);
                }
            }
            else if(islem==2){
                System.out.println("Lutfen Sisteme Yatirmak Istediginiz Para Miktarini Giriniz:");
                int para=scanner.nextInt();
                setBakiye(bakiye + para);
                System.out.println("Guncel Bakiyeniz:"+bakiye);
            }
        }
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @param HesapNo the HesapNo to set
     */
    public void setHesapNo(String HesapNo) {
        this.HesapNo = HesapNo;
    }

    /**
     * @param Şifre the Şifre to set
     */
    public void setŞifre(String Şifre) {
        this.Şifre = Şifre;
    }
    
    
}
