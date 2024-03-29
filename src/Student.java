

/**
 * Created by meudecc on 15/02/2017.
 */
public class Student {

    public enum AttendanceGrade {ABSENT, VERY_POOR, AVERAGE, GOOD, VERY_GOOD, NOT_POSSIBLE};

    public AttendanceGrade getAttendanceGrade(int attendance) {
        if (attendance < 0 || attendance > 100) throw new IllegalArgumentException();
        if(attendance == 0) return AttendanceGrade.ABSENT;
        if (attendance < 30) return AttendanceGrade.VERY_POOR;
        //if (attendance < 50) return AttendanceGrade.POOR;
        if (attendance < 70) return AttendanceGrade.AVERAGE;
        if (attendance <90) return AttendanceGrade.GOOD;
        if (attendance >=90) return AttendanceGrade.VERY_GOOD;
        return  AttendanceGrade.NOT_POSSIBLE;
    }
}