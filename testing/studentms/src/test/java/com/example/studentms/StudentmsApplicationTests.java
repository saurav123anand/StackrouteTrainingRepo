package com.example.studentms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class StudentmsApplicationTests {
    private Calculator c = new Calculator();

    @Test
    void contextLoads() {
    }

    @Test
    void testSum() {
		//expected result
        int expectedResult=17;
		//actual result
        int actualResult = c.doSum(12, 3, 2);
		assertThat(actualResult).isEqualTo(expectedResult);

    }
    @Test
    void testProduct() {
        //expected result
        int expectedResult=36;
        //actual result
        int actualResult = c.doProduct(12, 3);
        assertThat(actualResult).isEqualTo(expectedResult);

    }
    @Test
    void testCompareNum() {
        //actual result
        boolean actualResult = c.compareTwoNum(12, 12);
        assertThat(actualResult).isTrue();

    }


}
