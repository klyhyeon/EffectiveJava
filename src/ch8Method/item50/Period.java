package ch8Method.item50;

import java.util.Date;

public final class Period {

    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
//        if (start.compareTo(end) > 0)
//            throw new IllegalArgumentException("start가 end보다 클 수 없습니다.");
//        this.start = start;
//        this.end = end;
        //방어적 복사: 매개변수를 원본이 아닌 복사본을 만들어 사용해 변경을 방지
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException("start가 end보다 클 수 없습니다.");
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }
}
