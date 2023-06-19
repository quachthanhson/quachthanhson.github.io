package Day8_Homework.statics;

public enum LoaiBanDoc {
    Sinh_Vien("Sinh Viên"),
    Hoc_Vien_Cao_Hoc("Học viên cao học"),
    Giao_Vien("Giáo Viên");

    public String type;

    LoaiBanDoc(String type) {
        this.type = type;
    }
}
