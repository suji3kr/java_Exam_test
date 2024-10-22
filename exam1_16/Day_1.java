package exam1_16;

public class Day {
    private int year;
    private int month;
    private int date;

    // 생성자
    public Day(int year, int month, int date) {
        set(year, month, date);
    }

    // 날짜 설정
    public void set(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
        // 유효성 검사 로직 추가 필요
    }

    public void setYear(int year) {
        this.year = year;
        // 유효성 검사 로직 추가 필요
    }

    public void setMonth(int month) {
        this.month = month;
        // 유효성 검사 로직 추가 필요
    }

    public void setDate(int date) {
        this.date = date;
        // 유효성 검사 로직 추가 필요
    }

    // 윤년 검사
    public boolean isLeap() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 연도 내 경과 일수
    public int dayOfYear() {
        int[] daysInMonth = {31, isLeap() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days += daysInMonth[i];
        }
        days += date;
        return days;
    }

    // 연도 내 잔여 일수
    public int leftDayOfYear() {
        int totalDays = isLeap() ? 366 : 365;
        return totalDays - dayOfYear();
    }

    // 날짜 비교
    public int compareTo(Day other) {
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        }
        if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        }
        return Integer.compare(this.date, other.date);
    }

    // 하루 후
    public void succeed() {
        // 날짜를 하루 뒤로 이동하는 로직
    }

    // 하루 전
    public void precede() {
        // 날짜를 하루 앞으로 이동하는 로직
    }

    // n일 후
    public void succeedDays(int n) {
        // 날짜를 n일 뒤로 이동하는 로직
    }

    // n일 전
    public void precedeDays(int n) {
        // 날짜를 n일 앞으로 이동하는 로직
    }

    // 내일
    public Day succeedingDay() {
        // 다음 날을 반환
        return new Day(year, month, date); // 수정 필요
    }

    // 어제
    public Day precedingDay() {
        // 이전 날을 반환
        return new Day(year, month, date); // 수정 필요
    }

    // n일 후
    public Day after(int n) {
        // n일 후의 날짜를 반환
        return new Day(year, month, date); // 수정 필요
    }

    // n일 전
    public Day before(int n) {

        // n일 전의 날짜를 반환
        return new Day(year, month, date); // 수정 필요
    }

    // 문자열 출력
    @Override
    public String toString() {
        return year + "-" + month + "-" + date;
    }
}
