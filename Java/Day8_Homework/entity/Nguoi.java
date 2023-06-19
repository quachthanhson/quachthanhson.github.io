package Day8_Homework.entity;

public class Nguoi {
    protected String HoTen;
    protected String DiaChi;
    protected String SĐT;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSĐT() {
        return SĐT;
    }

    public void setSĐT(String SĐT) {
        this.SĐT = SĐT;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "HoTen='" + HoTen + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", SĐT='" + SĐT + '\'' +
                '}';
    }
}
