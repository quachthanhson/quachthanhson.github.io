package Day8_Homework.statics;

public enum ChuyenNganh {
    Khoa_hoc_tu_nhien("Khoa học tự nhiên"),
    Van_hoc_nghe_thuat("Văn học - Nghệ thuật"),
    Dien_tu_vien_thong("Điện tử viễn thông"),
    Cong_nghe_thong_tin("Công nghệ thông tin");

    public String type;

    ChuyenNganh(String type) {
        this.type = type;
    }
}
