package QuanLyNhuanButChoPhongVien.statics;

public enum InterviewLevel {
    chuyen_nghiep("Chuyên nghiệp"),
    nghiep_du("Nghiệp dư"),
    cong_tac_vien("Cộng tác viên");

    public String name;

    InterviewLevel(String name) {
        this.name = name;
    }
}
