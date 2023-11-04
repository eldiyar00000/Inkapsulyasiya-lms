public class School {
    private byte okuuchu;
    private byte mugalim;
    private byte etazh;
    public School(byte okuuchu, byte mugalim, byte etazh) {
        this.okuuchu = okuuchu;
        this.mugalim = mugalim;
        this.etazh = etazh;
    }
    public byte getOkuuchu() {
        return okuuchu;
    }
    public void setOkuuchu(byte okuuchu) {
        this.okuuchu = okuuchu;
    }
    public byte getMugalim() {
        return mugalim;
    }
    public void setMugalim(byte mugalim) {
        this.mugalim = mugalim;
    }
    public byte getEtazh() {
        return etazh;
    }
//    public void setEtazh(byte etazh) {
//        this.etazh = etazh;
    public String getIndoNumber() {
        return STR."""
                OKUUCHU: \{okuuchu }
                MUGALIM: \{mugalim }
                ETASH: \{etazh }
                   """;
    }
}

