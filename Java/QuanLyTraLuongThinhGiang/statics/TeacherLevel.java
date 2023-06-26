package QuanLyTraLuongThinhGiang.statics;

public enum TeacherLevel {
    GS_TS("Giáo sư - tiến sĩ"),
    PGS_TS("Phó giáo sư - tiến sĩ"),
    GIANG_VIEN_CHINH("Giảng viên chính "),
    THAC_SI("Thạc sĩ");

    public String name;

    TeacherLevel(String name) {
        this.name = name;
    }
}
