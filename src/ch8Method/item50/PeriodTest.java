package ch8Method.item50;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;


class PeriodTest {

    @Test
    @DisplayName("Period 변경 Attack 테스트 1")
    void periodAttackTest1() {
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        end.setTime(78);
        assertThat(period.end().getTime()).isEqualTo(78);
    }

    @Test
    @DisplayName("Period 변경 Attack 테스트 2")
    void periodAttackTest2() {
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        period.end().setTime(78);
        assertThat(period.end().getTime()).isNotEqualTo(78);
    }

}