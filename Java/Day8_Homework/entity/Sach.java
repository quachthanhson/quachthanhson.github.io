package Day8_Homework.entity;

public class Sach implements InputInfo{

    private  static int AUTO_ID=10000;

    private int MaSach;
    private String TenSach;
    private String TacGia;
    private String ChuyenNganh;
    private int NamSuatBan;

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int maSach) {
        MaSach = maSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        ChuyenNganh = chuyenNganh;
    }

    public int getNamSuatBan() {
        return NamSuatBan;
    }

    public void setNamSuatBan(int namSuatBan) {
        NamSuatBan = namSuatBan;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "MaSach=" + MaSach +
                ", TenSach='" + TenSach + '\'' +
                ", TacGia='" + TacGia + '\'' +
                ", ChuyenNganh='" + ChuyenNganh + '\'' +
                ", NamSuatBan=" + NamSuatBan +
                '}';
    }

    @Override
    public static void inputInfo(){
    }
}
