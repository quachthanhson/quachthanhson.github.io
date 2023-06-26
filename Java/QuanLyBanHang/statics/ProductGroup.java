package QuanLyBanHang.statics;

public enum ProductGroup {
    Dien_Tu("Điện tử"),
    Dien_Lanh("Điện lạnh"),
    May_Tinh("Máy tính"),
    Thiet_Bi_Van_Phong("Thiết bị văn phòng");

    private String name;

    ProductGroup(String name) {
        this.name = name;
    }
}
