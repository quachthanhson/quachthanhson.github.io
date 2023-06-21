package QuanLyNhuanButChoPhongVien.entity;

import QuanLyNhuanButChoPhongVien.statics.InterviewLevel;

public class Interview extends Person{

    private static int AUTO_ID = 10000;

    private int id;
    public InterviewLevel typeInterview;

    public Interview() {
        id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InterviewLevel getTypeInterview() {
        return typeInterview;
    }

    public void setTypeInterview(InterviewLevel typeInterview) {
        this.typeInterview = typeInterview;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "id=" + id +
                ", typeInterview=" + typeInterview +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
