import java.awt.image.Kernel;

import static java.lang.StringTemplate.STR;

public class University {
    String sabak;
    String okuuchylar;
    int kabinet;

public University(String sabak, String okuuchylar, int kabinet) {
    this.sabak = sabak;
    this.okuuchylar = okuuchylar;
    this.kabinet = kabinet;
   }
   public String getSabak() {
    return sabak;
   }
   public void setSabak(String sabak) {
    this.sabak = sabak;
   }
   public String getOkuuchylar(){
    return okuuchylar;
   }
   public void setOkuuchylar(String okuuchylar) {
    this.okuuchylar = okuuchylar;
   }
   public int getKabinet() {
    return kabinet;
   }
   public String getUnivInfo(){
    return STR."""
           SABAK: \{sabak}
           Okuuchular: \{okuuchylar}
           Kabinet: \{kabinet}
            """;

   }

}
