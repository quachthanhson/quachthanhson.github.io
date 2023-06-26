package QuanLyTraLuongThinhGiang.entity;

import java.util.Arrays;

public class TeachingManagement {
    private Teacher teacher;
    private TeachingManagementDetail[] details;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public TeachingManagementDetail[] getDetails() {
        return details;
    }

    public void setDetails(TeachingManagementDetail[] details) {
        this.details = details;
    }
}

