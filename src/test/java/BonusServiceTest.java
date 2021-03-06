import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void shouldCalculateRegistredAndUnderLimit() {
        BonusService service = new BonusService();
        long expected = 30;
        long bonus = service.calculate(1000_60, true);
        assertEquals(expected, bonus);
        System.out.println(bonus);
    }

    @Test
    void shouldCalculateRegistredAndOverLimit() {
        BonusService service = new BonusService();
        long expected = 500;
        long bonus = service.calculate(26000_60, true);
        assertEquals(expected, bonus);
        System.out.println(bonus);
    }
    @Test
    void shouldCalculateUnRegistredAndOverLimit() {
        BonusService service = new BonusService();
        long expected = 500;
        long bonus = service.calculate(10_456_587, false);
        assertEquals(expected, bonus);
        System.out.println(bonus);
    }

    @Test
    void shouldCalculateUnRegistredAndUnderLimit() {
        BonusService service = new BonusService();
        long expected = 2;
        long bonus = service.calculate(21000, false);
        assertEquals(expected, bonus);
        System.out.println(bonus);
    }

}