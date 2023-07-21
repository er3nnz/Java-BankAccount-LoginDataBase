public class BankaMain {
    
    public static void main(String[] args) {
      
       BankaProje hesap= new BankaProje();
       
       hesap.setHesapNo("1234");
       hesap.setŞifre("1234");
       hesap.setBakiye(5000);
        
       
       //Bu fonksiyon yardimi ile şifre && hesap numarasi giriliyor girilen bilgilerin ikisi de doğru ise sisteme girip 
       // para çekme veya para yatirma işlemleri seçiliyor.....
       hesap.girişİslemi("1234","1234");
    }
}
