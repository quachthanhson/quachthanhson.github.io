package Day8_Homework.statics;

public enum LoaiChuyenNganh {
    Khoa_Hoc_Tu_Nhien("Khoa học tự nhiên"),
    Van_Hoc_Nghe_Thuat("Văn học nghệ thuật"),
    Dien_Tu_Vien_Thong("Điện tử viễn thông"),
    Cong_Nghe_Thong_Tin("Công nghệ thông tin");

    public String type;

    LoaiChuyenNganh(String type) {
        this.type = type;
    }
    }
