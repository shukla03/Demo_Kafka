package testcase.demo;


import entity.Employee;
import entity.HCM;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


class EmployeeTest {

    //Eligible for promotion

    @Test
    public void isEligibleforPromotion() {
        List<HCM> h = new ArrayList<HCM>();
        List<HCM> filteredStream = h.stream()
                .filter(s -> s.isGoalCompletedForCurrentYear()).filter(s -> s.isEligibleForPromotion()).filter(s -> s.getYearsInCurrentRole() > 3).collect(Collectors.toList());

        assertNotNull(h);
    }

}