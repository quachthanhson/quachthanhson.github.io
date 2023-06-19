package Day8_Homework.entity;

import Day8_Homework.statics.LoaiBanDoc;

public class BanDoc extends Nguoi{

    private static int AUTO_ID = 10000;

    private int MaBanDoc;
    private LoaiBanDoc phanloai;

    public BanDoc(){
        this.MaBanDoc = AUTO_ID;
        AUTO_ID++;
    }

    public int getMaBanDoc() {
        return MaBanDoc;
    }

    public void setMaBanDoc(int maBanDoc) {
        MaBanDoc = maBanDoc;
    }

    public LoaiBanDoc getPhanloai() {

        return phanloai;
    }

    public void setPhanloai(LoaiBanDoc phanloai) {

        this.phanloai = phanloai;
    }

    @Override
    public String toString() {
        return "BanDoc{" +
                "MaBanDoc=" + MaBanDoc +
                ", phanloai=" + phanloai +
                ", HoTen='" + HoTen + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", SĐT='" + SĐT + '\'' +
                '}';
    }
}
