package Day8_Homework.entity;

import Day8_Homework.statics.LoaiChuyenNganh;

public class Sach {
    private static int AUTO_ID = 10000;

    protected int MaSach;
    protected String TenSach;
    protected String TacGia;
    protected LoaiChuyenNganh chuyennganh;
    protected String NamXuatBan;

    public Sach(){
        this.MaSach= AUTO_ID;
        AUTO_ID++;
    }

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

    public LoaiChuyenNganh getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(LoaiChuyenNganh chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public String getNamXuatBan() {

        return NamXuatBan;
    }

    public void setNamXuatBan(String namXuatBan) {

        NamXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "MaSach=" + MaSach +
                ", TenSach='" + TenSach + '\'' +
                ", TacGia='" + TacGia + '\'' +
                ", chuyennganh=" + chuyennganh +
                ", NamXuatBan='" + NamXuatBan + '\'' +
                '}';
    }
}

