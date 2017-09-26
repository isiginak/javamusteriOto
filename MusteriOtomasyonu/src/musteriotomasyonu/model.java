
package musteriotomasyonu;
public class model {
    String ad,soyad,urun,ariza,adres;

    public model() {
       
    }

    public model(String ad, String soyad,String urun, String ariza, String adres) {
        this.ad = ad;
        this.soyad = soyad;
        this.ariza = ariza;
        this.adres = adres; 
        this.urun = urun;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    public String getAriza() {
        return ariza;
    }

    public void setAriza(String ariza) {
        this.ariza = ariza;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    
}
