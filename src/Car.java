import org.w3c.dom.CDATASection;

import javax.xml.transform.sax.SAXResult;

public class Car {
    int model;
    String marka;
    short jyly;

    public Car(int model, String marka, short jyly) {
        this.model = model;
        this.marka = marka;
        this.jyly = jyly;
    }
    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public short getJyly() {
        return jyly;
    }
//    public void setJyly(short jyly) {
//        this.jyly = jyly;
    public String getInfoCar (){
        return STR."""
                MODEL: \{model }
                MARKA: \{marka }
                JYLY: \{jyly }
                """;
    }
}

